package pl.pjatk.kajwel.test.service;

import org.springframework.stereotype.Service;
import pl.pjatk.kajwel.test.model.TestCar;

import java.util.List;

@Service
public class TestService {
    public String getHello(String value) {
        return "Hello " + value + "!";
    }

    public String getHellos(List<String> values) {
        return "Hello " + String.join(", ", values) + "!";
    }

    public TestCar getDefaultCar() {
        return new TestCar();
    }

    public TestCar getCustomCar(String name, String model) {
        return new TestCar(name, model);
    }

    public void throwRuntimeException() {
        throw new RuntimeException("poof!");
    }
}
