import java.util.Scanner;

class MultiplesBelow100 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Multiples of " + n + " below 100 are:");

        int i = 1;
        while (n * i < 100) {
            System.out.print((n * i) + " ");
            i++;
        }
    }
}
