package pl.pjatk.kajwel.test.model;

public class TestCar {
    private final String name;
    private final String model;

    public TestCar() {
        this.name = "Some happy car";
        this.model = "The best one";
    }

    public TestCar(String name, String model) {
        this.name = name;
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }
}
