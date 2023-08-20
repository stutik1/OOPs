package threads;

public class ThreadPractice {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(1000);
                synchronized (ThreadPractice.class) {
                    ThreadPractice.class.wait();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Thread state: NEW
        System.out.println("Thread state: " + thread.getState());

        thread.start();

        // Thread state: RUNNABLE
        System.out.println("Thread state: " + thread.getState());

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Thread state: TIMED_WAITING
        System.out.println("Thread state: " + thread.getState());

        synchronized (ThreadPractice.class) {
            ThreadPractice.class.notify();
        }

        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Thread state: TERMINATED
        System.out.println("Thread state: " + thread.getState());
    }
}
