package example.micronaut;

import io.micronaut.context.annotation.Context;
import io.micronaut.scheduling.annotation.Scheduled;

@Context
public class CountService {

    private int total = 0;

    @Scheduled(fixedDelay = "1s", initialDelay = "1s")
    public void runJob() {
        System.out.println("-------> total = " + total);
        if (total <= 2) {
            total++;
        }
    }

    public int getTotal() {
        return total;
    }
}
