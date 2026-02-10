import java.util.Scanner;
class Grade 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number=");
		int phy=sc.nextInt();
		System.out.println("Enter a number");
		int chem=sc.nextInt();
		System.out.println("Enter a number");
		int maths=sc.nextInt();
		int per=(phy+chem+maths/3)*100;
		if(per<=100 && per>=80){
		System.out.println("A");}
		else if (per<=79 && per>=70){
		System.out.println("B");}
		else if (per<=69 && per>=60){
		System.out.println("C");}
		else if (per<=59 && per>=50){
		System.out.println("D");}
		else if (per<=49 && per>=40){
		System.out.println("E");}
		else if (per<=39 && per>=0){
		System.out.println("R");
		}
	}
}
			
		
		
