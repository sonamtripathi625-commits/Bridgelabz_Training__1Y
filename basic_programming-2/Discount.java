import java.util.Scanner;
class Discount
{
 public static void main(String args[])
 {
  Scanner D=new Scanner(System.in);
  System.out.println("actual amountoffee=");
  int actualamount=D.nextInt();
  int discount=(actualamount/100)*10;
  System.out.println("discountamount="+discount);
  int studentwillpay=actualamount-discount;
  System.out.println("studentwillpayfees="+studentwillpay);
  }
 }