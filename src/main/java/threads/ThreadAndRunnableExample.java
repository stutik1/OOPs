package threads;

/**
 * The Runnable interface defines a single method, run(), which represents the task that the thread will execute.
 * Threads created using the Runnable interface consume fewer system resources compared to extending
 *   the Thread class directly. This is because you can share the same Runnable instance among multiple threads.
 */
class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i < 3; i++) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //System.out.println("Thread MyRunnable" + Thread.currentThread().getPriority()+ ": " + i);
        }
    }
}
class MyThread extends Thread {
    @Override
    public void run() {

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
         System.out.println("Thread MyThread " + Thread.currentThread().getId()+ ": "+Thread.currentThread().getName() );
    }
}

public class ThreadAndRunnableExample {
    public static void main(String[] args) throws InterruptedException {

        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();
        System.out.println("thread1 Thread State after creation: " + thread1.getState());
        thread1.start();
        thread2.start();
        System.out.println("thread1 Thread State after creation: " + thread1.getState());

        Thread runnableThread1 = new Thread(new MyRunnable());
        Thread runnableThread2 = new Thread(new MyRunnable());
        runnableThread2.setPriority(Thread.MAX_PRIORITY);
        runnableThread2.start();
        runnableThread1.start();

        System.out.println("thread1 Thread State before join: " + thread1.getState());
        System.out.println("thread2 Thread State before join: " + thread2.getState());

        runnableThread2.join();
        System.out.println("runnableThread2 Thread State after join: " + runnableThread2.getState());
        System.out.println("thread1 Thread State before join: " + thread1.getState());

    }
}
