package String_API.Level1;

public class NullPointDemo {

    
    public static void generateException() {
        String text = null;
        System.out.println("Length of string: " + text.length());
    }


    public static void handleException() {
        String text = null;

        try {
            System.out.println("Length of string: " + text.length());
        }
        catch (NullPointerException e) {
            System.out.println("Exception caught: String is null!");
        }
    }

    public static void main(String[] args) {

        System.out.println("---- Generating Exception ----");

        try {
            generateException();
        }
        catch (NullPointerException e) {
            System.out.println("Exception caught in main method!");
        }

        System.out.println("\n---- Handling Exception Inside Method ----");
        handleException();

        System.out.println("\nProgram continues successfully...");
    }
}