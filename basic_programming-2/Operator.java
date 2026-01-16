import java.util.Scanner;
class Operator
{
	public static void main(String args[])
	{
		Scanner O=new Scanner(System.in);
		System.out.println("Enter no.pens=");
		double pens=O.nextDouble();
		System.out.println("no.of students=");
		double students=O.nextDouble();
		double C=pens/students;
		System.out.println("divide operator="+C);
		double D=pens%students;
		System.out.println("modulous operator="+D);
	}
}
		