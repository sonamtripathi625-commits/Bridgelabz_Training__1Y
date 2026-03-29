package com.exception;

public class ExceptionHandlingPractice2 {
    static void ageChecker(int a){
        if(a<18){
            throw  new ArithmeticException("Eligilble for vote");
        }
        System.out.println("valid age");
    }
    public static void main(String[] args){
        ageChecker(100);

        }
    }

