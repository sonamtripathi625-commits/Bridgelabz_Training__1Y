import java.util.Scanner;
class Amstrongno
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a no.");
int n=sc.nextInt();
int arm=0;
int r;
int c;
c=n;
while(n>0)
{
r=n%10;
arm=(r*r*r)+arm;
n=n/10;
}
if(c==arm)
{
System.out.println("arm no.");
}
else{
System.out.println(" non arm no.");
 }
 }
}

