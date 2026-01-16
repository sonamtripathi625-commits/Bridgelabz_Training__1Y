import java.util.Scanner;
class Height
{
 public static void main(String args[])
 {
 Scanner H=new Scanner(System.in);
 System.out.println("height in cm=");
 int Cm=H.nextInt();
 double inches=0.3937*Cm;
 System.out.println("height in inches="+inches);
 double feet=inches/12;
 System.out.println("height in feet="+feet);
  }
 }
 