import java.util.Scanner;
class Hanshakes
{
public static void main(String args[])
{
Scanner H=new Scanner(System.in);
System.out.println("numberofstudentvariable=");
int S=H.nextInt();
double C=(S*(S-1.0)/2.0);
System.out.println("noofpossiblehandshakes="+C);
 }
}
