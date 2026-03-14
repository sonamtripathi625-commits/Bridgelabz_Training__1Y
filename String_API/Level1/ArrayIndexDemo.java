package String_API.Level1;

import java.util.Scanner;

public class ArrayIndexDemo {

    public static void generateException(String[] names) {
        System.out.println("Generating Exception...");
        System.out.println("Accessing element: " + names[names.length]);
    }

    public static void handleException(String[] names) {
        System.out.println("\nHandling Exception...");

        try {
            System.out.println("Accessing element: " + names[names.length]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException Caught: " + e);
        }
        catch (RuntimeException e) {
            System.out.println("RuntimeException Caught: " + e);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of names: ");
        int size = sc.nextInt();
        sc.nextLine();

        String[] names = new String[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.nextLine();
        }
        try {
            generateException(names);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception occurred in generateException(): " + e);
        }

        handleException(names);
    }
}