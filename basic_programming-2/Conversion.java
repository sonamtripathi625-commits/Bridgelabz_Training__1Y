import java.util.Scanner;
class Conversion
{
	public static void main(String args[])
	{
		 Scanner C=new Scanner(System.in);
		 
		 System.out.println("Enter kilometer=");
		 double Km=C.nextDouble();
		 double miles= Km*1.6;
		 System.out.println("Coversion is="+miles);
	}
}