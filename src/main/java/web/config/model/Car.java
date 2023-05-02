package web.config.model;

import java.util.Objects;

public class Car {
    private String model;
    private String color;
    private int power;
    public Car(){}
//
    public Car(String model, String color, int power) {
        this.model = model;
        this.color = color;
        this.power = power;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", power=" + power +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return power == car.power && model.equals(car.model) && color.equals(car.color);
    }

    @Override
    public int hashCode() {

        return Objects.hash(model, color, power);
    }
}
