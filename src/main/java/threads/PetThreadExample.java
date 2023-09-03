package threads;

public class PetThreadExample {
    private static final Object megha = new Object();
    private static int n = 1;
    private static final int N = 10;

    public static void main(String[] args) {
        Thread cat = new CatThread();
        Thread dog = new DogThread();
        cat.start();
        dog.start();
    }

    static class CatThread extends Thread {
        @Override
        public void run() {
            synchronized (megha) {
                while (n <= N) {
                    if (n % 3 == 0) {
                        System.out.println("Cat");
                        n++;
                        megha.notify();
                    } else {
                        try {
                            megha.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }

    static class DogThread extends Thread {
        @Override
        public void run() {
            synchronized (megha) {
                while (n <= N) {
                    if (n % 3 != 0) {
                        System.out.println("Dog");
                        n++;
                        megha.notify();
                    }else {
                        try {
                            megha.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}
