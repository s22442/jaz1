package pl.pjatk.kajwel.test.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.pjatk.kajwel.test.model.TestCar;

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
    public ResponseEntity<TestCar> getDefaultCar() {
        return ResponseEntity.ok(new TestCar());
    }

    @PostMapping("/model")
    public ResponseEntity<TestCar> getCustomCar(String name, String model) {
        return ResponseEntity.ok(new TestCar(name, model));
    }

    @GetMapping("/exception")
    public void getException() {
        throw new RuntimeException("poof!");
    }
}
