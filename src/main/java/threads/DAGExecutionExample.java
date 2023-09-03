package threads;

import java.util.concurrent.*;

public class DAGExecutionExample {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        CompletableFuture<Void> taskA = CompletableFuture.runAsync(() -> System.out.println("Task A"));
        CompletableFuture<Void> taskB = CompletableFuture.runAsync(() -> System.out.println("Task B"));
        CompletableFuture<Void> taskC = taskA.thenCombineAsync(taskB, (resultA, resultB) -> {
            System.out.println("Task C depends on A and B");
            return null;
        });
        CompletableFuture<Void> taskD = taskC.thenRun(() -> System.out.println("Task D depends on C"));

        // Wait for the entire DAG to complete
        CompletableFuture<Void> allTasks = CompletableFuture.allOf(taskA, taskB, taskC, taskD);
        allTasks.get();

        // Shutdown the executor if necessary
        // executor.shutdown();
    }
}
