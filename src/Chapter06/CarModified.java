package Chapter06;

public class CarModified {
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    CarModified() {

    }
    CarModified(String model) {
        this(model, "은색", 250);
    }
    CarModified(String model, String color) {
        this(model, color, 250);
    }
    CarModified(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
