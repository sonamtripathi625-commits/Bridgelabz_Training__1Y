import java.util.Scanner;

class SumUntilZeroNegative {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int number;

        while (true) {
            System.out.println("Enter number to sum:");
            number = sc.nextInt();

            if (number <= 0) {
                break;
            }

            sum += number;
        }

        System.out.println("Sum of positive numbers = " + sum);
    }
}
