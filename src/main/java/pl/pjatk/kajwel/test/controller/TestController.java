package pl.pjatk.kajwel.test.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.pjatk.kajwel.test.model.TestCar;
import pl.pjatk.kajwel.test.service.TestService;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {
    private final TestService testService;

    TestController(TestService testService) {
        this.testService = testService;
    }

    @GetMapping("/hello")
    public ResponseEntity<String> getHelloWithParam(@RequestParam(defaultValue = "World") String value) {
        return ResponseEntity.ok(this.testService.getHello(value));
    }

    @GetMapping("/hellos")
    public ResponseEntity<String> getHelloWithParams(@RequestParam List<String> values) {
        return ResponseEntity.ok(this.testService.getHellos(values));
    }

    @GetMapping("/hello/{slug}")
    public ResponseEntity<String> getHelloWithSlug(@PathVariable("slug") String value) {
        return ResponseEntity.ok(this.testService.getHello(value));
    }

    @GetMapping("/model")
    public ResponseEntity<TestCar> getDefaultCar() {
        return ResponseEntity.ok(this.testService.getDefaultCar());
    }

    @PostMapping("/model")
    public ResponseEntity<TestCar> getCustomCar(String name, String model) {
        return ResponseEntity.ok(this.testService.getCustomCar(name, model));
    }

    @GetMapping("/exception")
    public ResponseEntity<Void> getException() {
        this.testService.throwRuntimeException();
        return ResponseEntity.ok().build();
    }
}
