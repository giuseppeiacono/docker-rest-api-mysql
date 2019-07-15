package booking.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BookingEngine {

    @RequestMapping("/")
    public String home() {
        return "Hello to dockerized booking engine";
    }

    public static void main(String[] args) {
        SpringApplication.run(BookingEngine.class, args);
    }

}
