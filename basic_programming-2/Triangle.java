import java.util.Scanner;
class Triangle
{
public static void main(String args[])
{
Scanner T=new Scanner(System.in);
System.out.println("Base in cm=");
int Base=T.nextInt();
System.out.println("Height in cm=");
int Height=T.nextInt();
double Area=1.0/2.0*(Base*Height);
System.out.println("area of triangle="+Area);
double inches=0.3937*Area;
System.out.println("areain inches="+inches);
double feet=inches/12;
System.out.println("areain feet="+feet);
 }
}