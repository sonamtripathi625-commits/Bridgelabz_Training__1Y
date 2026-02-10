import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
         if (number == 1) {
            System.out.println("1 has no proper factor");
            return;
        }
		int smallestprimefactor=0;
		
        for(int i=2; i<= number;i++) {
            if (number % i == 0) {
               smallestprimefactor=i;
				break;
		 }
		}
		int greatestfactor= number /smallestprimefactor;
		System.out.println("Greatest Fcator="+greatestfactor);
        }
    }
