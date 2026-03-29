package com.exception;
class InvalidAgeException1 extends Exception{
    public InvalidAgeException1(String message){
        super(message);
    }

}

public class CustomExceptionPractice {
    static  void ageCheck(int a)throws InvalidAgeException1 {
        if (a > 18) {
            throw new InvalidAgeException1("Invalid age");
        }
        System.out.println("valide age");
    }

        public static void main (String[]args){
            try {
                ageCheck(100);
            } catch (InvalidAgeException1 s) {
                System.out.println(s);

            }
        }
    }