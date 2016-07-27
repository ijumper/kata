package uk.co.ijump.kata;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReportController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/report")
    public Report greeting(@RequestParam(value="description", defaultValue="Kata Description") String description, @RequestParam(value="id", defaultValue="1") int id) {
        return new Report(description, id);
    }
}