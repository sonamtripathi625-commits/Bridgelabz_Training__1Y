package com.exception;

public class Test {
    public static void arithematicException(){
        try{
            int a=10;
            int b=0;
            double result =a/b;
            System.out.println(result);

        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
        finally{
            System.out.println("mai har bar run karungi");
        }
    }
    public static void nullPointerException(){
        try{
            String s1=null;
            String s2=null;
            System.out.println(s1.equals(s2));
        }catch (NullPointerException e){
            System.out.println(e);
        }
        finally{
            System.out.println("mai har bar run kerungi");
        }
    }
    public static void arrayIndexOutOfBound(){
        try{
            int arr[]={1,2,3,4,5};
            System.out.println(arr[5]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        finally{
            System.out.println("mai har bar run kerungi");
        }
    }
    public static void main(String[] args){
        arithematicException();
        nullPointerException();
        arrayIndexOutOfBound();
    }
}
