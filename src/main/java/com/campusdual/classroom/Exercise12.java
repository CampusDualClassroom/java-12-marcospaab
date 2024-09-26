package com.campusdual.classroom;

public class Exercise12 {
    public static void main(String[] args) {
        Car c1 = new Car("Citroen", "C3", "Metralla");
        System.out.println(c1.isTachometerEqualToZero());
        c1.start();
        c1.start();
        c1.accelerate();
        c1.accelerate();
        c1.brake();
        c1.brake();
        c1.turnAngleOfWheels(42);
        c1.turnAngleOfWheels(49);
        c1.setReverse(true);
        c1.accelerate();
        c1.setReverse(false);
        c1.setReverse(true);
        c1.showDetails();
    }

}