import java.util.Scanner;
class Profit
{
 public static void main(String args[])
 {
 Scanner P=new Scanner(System.in);
 System.out.println("Enter costprice=");
 int costprice=P.nextInt();
 System.out.println("enter sellingprice=");
 int sellingprice=P.nextInt();
 System.out.println("Eneter profitprice=");
 int profitprice=P.nextInt();
 double profitpersentage=((double)profitprice/costprice)*100;
 System.out.println("Enter profitpersentage="+profitpersentage);
  }
 }
 
 