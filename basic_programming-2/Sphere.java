import java.util.Scanner;
class Sphere
{
public static void main(String args[])
{
Scanner S=new Scanner(System.in);
System.out.println("radius of volume=");
int R=S.nextInt();
double V=(4.0*3.14*R*R*R)/3.0;
System.out.println("Volume of sphere="+V);
double Vol=V*0.24;
System.out.println("convert into miles="+Vol);
 }
}