import java.util.Scanner;
class OddEven
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a no.=");
int n=sc.nextInt();

for(int i=1;i<=n;i++)
{
if(i%2==0)
System.out.println("Even no.="+i);
else
System.out.println("Odd no.="+i);
}
 
 }
}