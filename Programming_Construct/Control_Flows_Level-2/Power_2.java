import java.util.Scanner;

class PowerWithoutMath {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base number: ");
        int base = sc.nextInt();

        System.out.print("Enter exponent: ");
        int exponent = sc.nextInt();

        int result = 1;
        

        for(int i=1;i <= exponent;i++) {
            result = result * base;
            
        }

        System.out.println("Result = " + result);
    }
}
