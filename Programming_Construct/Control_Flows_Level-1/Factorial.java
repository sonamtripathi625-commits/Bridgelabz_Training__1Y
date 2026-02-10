import java.util.Scanner;
class Factorial
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
int n=sc.nextInt();
int i;
int fact=1;
if(n==0){
System.out.println(n+1);
}
else{
fact=1;
for(i=n;i>1;i--)
fact=fact*i;
}
System.out.println(fact);
 }
}