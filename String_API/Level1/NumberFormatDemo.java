package String_API.Level1;

    import java.util.Scanner;

    public class NumberFormatDemo {


        public static void generateException(String text) {
            System.out.println("Generating Exception...");


            int number = Integer.parseInt(text);
            System.out.println("Converted Number: " + number);
        }

        public static void handleException(String text) {
            System.out.println("\nHandling Exception...");

            try {
                int number = Integer.parseInt(text);
                System.out.println("Converted Number: " + number);
            }
            catch (NumberFormatException e) {
                System.out.println("NumberFormatException Caught: " + e);
            }
            catch (RuntimeException e) {
                System.out.println("RuntimeException Caught: " + e);
            }
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);


            System.out.print("Enter a number: ");
            String text = sc.nextLine();


            generateException(text);


            handleException(text);
        }
    }

