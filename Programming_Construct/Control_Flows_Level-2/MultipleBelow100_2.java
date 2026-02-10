import java.util.Scanner;

class MultiplesBelow100_2
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Multiples of " + n + " below 100 are:");

        
        for (int i=1;n * i < 100;i++) {
            System.out.print((n * i) + " ");
            
        }
    }
}
