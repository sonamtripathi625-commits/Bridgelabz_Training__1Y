import java.util.Scanner;
class Sam
{
	public static void main(String args[])
	{
		Scanner B=new Scanner(System.in);
		
		System.out.println("Enter First sub=");
		int maths =B.nextInt();
		System.out.println("Enter Second sub=");
		int phy= B.nextInt();
		System.out.println("Enter Third sub=");
		int chem=B.nextInt();
		int Average=(phy+chem+maths)/3;
		System.out.println("Total average="+Average);
	}
}
		
	


	
	