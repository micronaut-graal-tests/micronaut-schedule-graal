package micronaut.example;

import io.micronaut.scheduling.annotation.Scheduled;

import javax.inject.Singleton;

@Singleton
public class CountService {

    private int total = 0;

    @Scheduled(fixedDelay = "1s", initialDelay = "1s")
    public void runJob() {
        if (total <= 2) {
            total++;
        }
    }

    public int getTotal() {
        return total;
    }
}
