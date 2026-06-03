import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.ArrayList;
import java.util.List;

public class ExecutorServiceCallableExample {

    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(5);

        List<Callable<Integer>> tasks = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            int value = i;
            tasks.add(() -> value * value);
        }

        List<Future<Integer>> results = new ArrayList<>();

        for (Callable<Integer> task : tasks) {
            results.add(executor.submit(task));
        }

        for (Future<Integer> result : results) {
            try {
                System.out.println(result.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }

        executor.shutdown();
    }
}