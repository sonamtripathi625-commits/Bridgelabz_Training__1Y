package com.exception;

public class ExceptionHandlingPractice3 {
    static void ageChecker(int a) throws ArithmeticException,NullPointerException{
        if(a<18){
            throw new ArithmeticException(" eligilble");}
        System.out.println("valid age");
    }
    public static void main(String[] args){
       try{ ageChecker(10);
        }catch (ArithmeticException e){
           System.out.println(e.getMessage());
       }
    }
}
