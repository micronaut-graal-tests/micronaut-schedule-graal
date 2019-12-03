package micronaut.example;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/")
public class CountController {

    private final CountService countService;

    @Get(value = "/count", produces = MediaType.TEXT_PLAIN)
    public int counter() {
        return countService.getTotal();
    }

    public CountController(CountService countService) {
        this.countService = countService;
    }
}
