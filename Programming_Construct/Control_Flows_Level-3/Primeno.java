import java.util.Scanner;
class Primeno
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
int n=sc.nextInt();
boolean prime=true;
for(int i=2;i*i<=n;i++){
if(n%i==0){
prime=false;
break;
 }
}
if(prime && n>1){
System.out.println("Prime no.");
}
else{
System.out.println("Not Prime no.");
}
 }
}