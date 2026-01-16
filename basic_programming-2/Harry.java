import java.util.Scanner;
class Harry
{
public static void main(String args[])
{
    Scanner A=new Scanner(System.in);
	
	System.out.println("Enter Date of Birth Year=");
	int birthyear=A.nextInt();
	System.out.println("Enter current year=");
	int currentyear=A.nextInt();
	int age=currentyear-birthyear;
	System.out.println("Enter Present age="+age);
	}
	
}
	