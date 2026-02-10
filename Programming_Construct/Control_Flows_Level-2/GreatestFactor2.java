import java.util.Scanner;

public class GreatestFactor2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
         if (number == 1) {
            System.out.println("1 has no proper factor");
            return;
        }
		int smallestprimefactor=0;
		int i=2;
        while(i<= number) {
            if (number % i == 0) {
               smallestprimefactor=i;
			   i++;
				break;
		 }
		}
		int greatestfactor= number /smallestprimefactor;
		System.out.println("Greatest Fcator="+greatestfactor);
        }
    }
