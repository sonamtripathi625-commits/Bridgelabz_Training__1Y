import java.util.*;
class Bonus{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		double oldsalary=new double[10];
		double bonus=new double[10];
		double newsalary=new double[10];
		double totalBonus=0;
		int service[]=new int[10];
		for(int i=0;i<=10;i++){
		System.out.println("Employee " + (i + 1));

            System.out.print("Enter years of service: ");
            int service = sc.nextInt();

            System.out.print("Enter old salary: ");
            double oldSalary = sc.nextDouble();
			if (service >= 5) {
                bonus = oldSalary * 0.10;
            } else {
                bonus = oldSalary * 0.05;
            }

            newSalary = oldSalary + bonus;
            totalBonus += bonus;
            System.out.println();
        }
		System.out.println("Employee details : ");
		
		for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + " " + oldSalary + "  " +bonus + "   " + newSalary);
        }

        System.out.println(" Zara has to pay: " + totalBonus);
    }
}