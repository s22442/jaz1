package pl.pjatk.kajwel;

public class Car {
    private String name;
    private String model;

    public Car() {
        this.name = "Some happy car";
        this.model = "The best one";
    }

    public Car(String name, String model) {
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
