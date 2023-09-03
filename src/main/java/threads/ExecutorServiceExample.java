package threads;

import java.math.BigInteger;
import java.util.concurrent.*;


public class ExecutorServiceExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        //basicExecutorService();

        long startTime = System.currentTimeMillis();
        calculateFactUsingSingleThread(1000);
        long endTime = System.currentTimeMillis();
        System.out.println("1st Execution time: " + (endTime-startTime) + " milliseconds");

        calculateFactUsingMultiThread(1000,8);
        long endTime2 = System.currentTimeMillis();
        System.out.println("2nd Execution time: " + (endTime2-endTime) + " milliseconds");
    }

    public static void basicExecutorService(){
            //Step 1
            ExecutorService executor = Executors.newFixedThreadPool(3);
            for (int i = 0; i < 10; i++) {
                Runnable task = () -> System.out.println("Task executed by " + Thread.currentThread().getName());
                //Step 2
                executor.submit(task);
            }
            //Step 3
            executor.shutdown();
    }

    private static void calculateFactUsingSingleThread(int number) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(1);
        FactorialCalculator calculator = new FactorialCalculator(1, number);
        Future<BigInteger> factorial=executor.submit(calculator);
        System.out.println("Factorial of " + number + " is: " + factorial.get());
        executor.shutdown();
    }

    static class FactorialCalculator implements Callable<BigInteger> {
        private final int start;
        private final int end;

        public FactorialCalculator(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public BigInteger call() {
            BigInteger factorial = BigInteger.ONE;
            for (int i = start; i <= end; i++) {
                factorial =factorial.multiply(new BigInteger(String.valueOf(i)));
            }
            return factorial;
        }
    }
    public static void calculateFactUsingMultiThread(int number, int thread){
        // Create an ExecutorService with a fixed thread pool size of 4
        ExecutorService executor = Executors.newFixedThreadPool(thread);
        int partitions = thread; // Number of partitions for calculating factorial

        // Divide the task into partitions and submit them to the executor
        int partitionSize = number / partitions;
        int remaining = number % partitions;

        int startIndex = 1;
        int endIndex = partitionSize;

        Future<BigInteger>[] futures = new Future[partitions];

        for (int i = 0; i < partitions; i++) {
            if (i == partitions - 1) {
                endIndex += remaining;
            }

            FactorialCalculator calculator = new FactorialCalculator(startIndex, endIndex);
            futures[i] = executor.submit(calculator);

            startIndex = endIndex + 1;
            endIndex = endIndex + partitionSize;
        }

        // Collect results from the futures
        BigInteger totalFactorial = BigInteger.ONE;
        for (Future<BigInteger> future : futures) {
            try {
                totalFactorial=totalFactorial.multiply(future.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Factorial of " + number + " is: " + totalFactorial);

        // Shutdown the executor
        executor.shutdown();
    }
}


