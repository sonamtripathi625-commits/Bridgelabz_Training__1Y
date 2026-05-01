package Rejex;

public class colorcode {

        public static void main(String[] args) {
            String plate = "AB1234";

            if(plate.matches("^[A-Z]{2}[0-9]{4}$")) {
                System.out.println("Valid Plate");
            } else {
                System.out.println("Invalid Plate");
            }
        }
    }

