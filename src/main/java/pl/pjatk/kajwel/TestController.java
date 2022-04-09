package pl.pjatk.kajwel;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {
    @GetMapping("/hello")
    public ResponseEntity<String> getHelloWithParam(@RequestParam(defaultValue = "World") String value) {
        return ResponseEntity.ok("Hello " + value + "!");
    }

    @GetMapping("/hellos")
    public ResponseEntity<String> getHelloWithParams(@RequestParam List<String> values) {
        return ResponseEntity.ok("Hello " + String.join(", ", values) + "!");
    }

    @GetMapping("/hello/{slug}")
    public ResponseEntity<String> getHelloWithSlug(@PathVariable("slug") String str) {
        return ResponseEntity.ok("Hello " + str + "!");
    }

    @GetMapping("/model")
    public ResponseEntity<Car> getDefaultCar() {
        return ResponseEntity.ok(new Car());
    }

    @PostMapping("/model")
    public ResponseEntity<Car> getCustomCar(String name, String model) {
        return ResponseEntity.ok(new Car(name, model));
    }
}
