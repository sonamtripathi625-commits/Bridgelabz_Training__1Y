import java.util.Scanner;
class Items
{
public static void main(String args[])
{
Scanner I=new Scanner(System.in);
System.out.println("Enter unitprice=");
int U=I.nextInt();
System.out.println("Enter quantity=");
int Q=I.nextInt();
int totalprice=U*Q;
System.out.println("totalpurchaseprice="+totalprice);
 }
}


