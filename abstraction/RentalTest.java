package com.abstraction;
interface RentalVehicle {
    void rent();
    void returnVehicle();
}
class Car implements RentalVehicle {
    public void rent() {
        System.out.println("Car rented");
    }

    public void returnVehicle() {
        System.out.println("Car returned");
    }
}

class Bike implements RentalVehicle {
    public void rent() {
        System.out.println("Bike rented");
    }

    public void returnVehicle() {
        System.out.println("Bike returned");
    }
}

class Bus implements RentalVehicle {
    public void rent() {
        System.out.println("Bus rented");
    }

    public void returnVehicle() {
        System.out.println("Bus returned");
    }
}
public class RentalTest {
    public static void main(String[] args) {
        RentalVehicle v1 = new Car();
        RentalVehicle v2 = new Bike();

        v1.rent();
        v2.rent();

        v1.returnVehicle();
    }
}