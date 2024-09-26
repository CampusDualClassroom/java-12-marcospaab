package com.campusdual.classroom;

import java.sql.SQLOutput;

public class Car {
    public String brand;
    public String model;
    public static final int MAX_SPEED = 120;
    public String fuel;
    public int speedometer = 0;
    public int tachometer = 0;
    String gear = "N";
    public boolean reverse = false;
    public int wheelsAngle = 0;

    public Car(String brand, String model, String fuel) {
        this.brand = brand;
        this.model = model;
        this.fuel = fuel;
    }

    public Car() {
        // Constructor por defecto
    }

    public void start() {
        if (this.tachometer == 0) {
            this.tachometer = 1000;
            System.out.println("Vehículo encendido");
        } else {
            System.out.println("El vehículo ya está encendido");
        }
    }

    public void stop() {
        if (this.speedometer == 0) {
            this.tachometer = 0;
            System.out.println("Vehículo apagado");
        } else {
            System.out.println("No se puede apagar el vehículo, primero tiene que estar detenido");
        }
    }

    public void accelerate() {
        if(this.tachometer > 0){
            this.speedometer += 10;

            if(this.speedometer > MAX_SPEED){
                this.speedometer = MAX_SPEED;
                System.out.println("No se puede superar la velocidad maxima.");
            }else{
                System.out.println("No se puede acelerar un coche apagado.");
            }
        }
    }

    public void brake() {
        if(this.tachometer > 0) {
            this.speedometer -= 10;
            if (this.speedometer < 0) {
                this.speedometer = 0;
                System.out.println("No se puede tener velocidad negativa.");
            } else {
                System.out.println("El coche ha frenado a " + this.speedometer + " km/h.");
            }
        }else{
            System.out.println("No se puede frenar un coche apagado.");
        }
    }

    public void turnAngleOfWheels(int angle) {
        if(angle > 45){
            this.wheelsAngle = 45;
        }else if(angle < -45){
            this.wheelsAngle = -45;
        }else{
            this.wheelsAngle = angle;
        }
    }

    public String showSteeringWheelDetail() {


        return "El ángulo de las ruedas es "+this.wheelsAngle+" grados";
    }

    public boolean isReverse() {
        return this.reverse;
    }

    public void setReverse(boolean reverse) {
        if(this.speedometer == 0) {
            this.reverse = reverse;
            if (reverse) {
                this.gear = "R";
                //coche marcha atras
            } else {
                this.gear = "N";
                //coche palante
            }
        }else{
            System.out.println("No se puede cambiar a marcha atras mientras el coche está en movimiento.");
        }
    }

    public void showDetails() {
        System.out.println("Marca: "+this.brand);
        System.out.println("Modelo: "+this.model);
        System.out.println("Combustible: "+this.fuel);
        System.out.println("Velocimetro: "+this.speedometer);
        System.out.println("Tacometro: "+this.tachometer);
        System.out.println("Ángulo de las ruedas: "+this.wheelsAngle);
        System.out.println("Marcha: "+(this.reverse ? "R": this.gear));
    }

    public boolean isTachometerEqualToZero(){
        if(tachometer == 0){
            return true;
        }else{
            return false;
        }
    }

    public boolean isTachometerGreaterThanZero(){
        if(tachometer > 0){
            return true;
        }else{
            return false;
        }
    }

}
