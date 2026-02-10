import java.util.Scanner;

class DirSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = sc.nextInt();

        int flag = 1;		// control variable
         int i;
		 
        for(i=0;i<=flag;i++) {
            int sum = n * (n + 1) / 2;   // formula used
            System.out.println("Sum = " + sum);
            flag = 0;        // makes condition false
        }
    }
}
