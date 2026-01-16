import java.util.Scanner;
class UniversityD
{
 public static void main(String args[])
 {
 Scanner U=new Scanner(System.in);
 System.out.println("Enter discounted percentage=");
 int Dis=U.nextInt();
 System.out.println("actual amount of fee=");
 int fees=U.nextInt();
 int  Discount=(fees/100)*Dis;
 System.out.println("discountamount="+Discount);
 int studentwillpay=fees-Discount;
 System.out.println("studentwillpayfees="+studentwillpay);
  }
 }