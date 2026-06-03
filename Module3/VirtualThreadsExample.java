import java.time.Duration;
import java.time.Instant;

public class VirtualThreadsExample {

    public static void main(String[] args) throws Exception {

        int n = 100000;

        Instant startVirtual = Instant.now();

        for (int i = 0; i < n; i++) {
            Thread.startVirtualThread(() -> {
                System.out.println("Virtual thread: " + Thread.currentThread());
            });
        }

        Thread.sleep(3000);

        Instant endVirtual = Instant.now();

        System.out.println("Virtual Threads Time: " +
                Duration.between(startVirtual, endVirtual).toMillis() + " ms");

        int smallN = 1000;

        Instant startPlatform = Instant.now();

        Thread[] threads = new Thread[smallN];

        for (int i = 0; i < smallN; i++) {
            threads[i] = new Thread(() -> {
                System.out.println("Platform thread: " + Thread.currentThread());
            });
            threads[i].start();
        }

        for (int i = 0; i < smallN; i++) {
            threads[i].join();
        }

        Instant endPlatform = Instant.now();

        System.out.println("Platform Threads Time: " +
                Duration.between(startPlatform, endPlatform).toMillis() + " ms");
    }
}