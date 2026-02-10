import java.util.Scanner;

class DirectSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = sc.nextInt();

        int flag = 1;          // control variable

        while (flag == 1) {
            int sum = n * (n + 1) / 2;   // formula used
            System.out.println("Sum = " + sum);
            flag = 0;        // makes condition false
        }
    }
}
