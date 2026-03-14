package String_API.Level1;
import java.util.Scanner;

public class StringIndexDemo {


    public static void generateException(String text) {
        System.out.println("Generating Exception...");


        char ch = text.charAt(text.length());
        System.out.println("Character: " + ch);
    }

    public static void handleException(String text) {
        System.out.println("\nHandling Exception...");

        try {
            char ch = text.charAt(text.length());
            System.out.println("Character: " + ch);
        }
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception Caught: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String text = sc.nextLine();


        try {
            generateException(text);
        }
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception occurred in generateException(): " + e);
        }

        handleException(text);
    }
}