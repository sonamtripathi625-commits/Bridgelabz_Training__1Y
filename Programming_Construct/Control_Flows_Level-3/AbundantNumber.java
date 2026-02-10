import java.util.Scanner;

class AbundantNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int sum = 0;

        // finding proper divisors
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }

        if (sum > n) {
            System.out.println(n + " is an Abundant number");
        } else {
            System.out.println(n + " is NOT an Abundant number");
        }
    }
}
