import java.util.Scanner;
class Sumof
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number1=");
		int number1=sc.nextInt();
		System.out.println("Enter a number2=");
		int Number2=sc.nextInt();
		int sum=0;
		for(int i=number1;i>=Number2;i++)
		{
			sum+=i;
		}
		System.out.println(sum);
	}
}
		