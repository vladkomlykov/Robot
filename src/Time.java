
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Time {


    public void start() {
        Task task = new Task();
        long delay1 = 5, delay2 = 60, period1 = 1, period2 = 0;
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(3);
        executorService.scheduleAtFixedRate(task::fiveSeconds, delay1, period1, TimeUnit.SECONDS);
        executorService.scheduleAtFixedRate(task::fiveSeconds, delay2, period2, TimeUnit.SECONDS);
    }

    class Task {
        void fiveSeconds() {
            System.out.println("Начало уборки");

        }

         void sixSeconds() {
            System.out.println("static");
        }
    }
}