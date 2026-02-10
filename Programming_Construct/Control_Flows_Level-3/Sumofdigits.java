import java.util.Scanner;
class Sumofdigits
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a no.");
int n=sc.nextInt();
int sum=1;
int r;

for(int i=1;i<=n;i++)
{
r=n%10;
sum=sum+r;
n=n/10;
}
System.out.println(sum);
 }
}