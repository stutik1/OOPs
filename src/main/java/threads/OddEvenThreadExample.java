package threads;

public class OddEvenThreadExample {
    private static final Object lock = new Object();
    private static int number = 1;
    private static final int N = 10;

    public static void main(String[] args) {
        Thread oddThread = new OddNumberThread();
        Thread evenThread = new EvenNumberThread();

        Thread catThread=new Thread(()-> System.out.println("Cat"));
        catThread.start();
        oddThread.start();
        evenThread.start();
    }

    static class OddNumberThread extends Thread {
        @Override
        public void run() {
            synchronized (lock) {
                while (number <= N) {
                    if (number % 2 != 0) {
                        System.out.println("Odd: " + number);
                        number++;
                        lock.notify();
                    } else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }

    static class EvenNumberThread extends Thread {
        @Override
        public void run() {
            synchronized (lock) {
                while (number <= N) {
                    if (number % 2 == 0) {
                        System.out.println("Even: " + number);
                        number++;
                        lock.notify();
                    } else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}
