import java.util.Scanner;

class Fact {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = sc.nextInt();

        int fact = 1;
        int i = n;

        while (i >= 1) {
            fact = fact * i;
            i--;
        }

        System.out.println(fact);
    }
}
