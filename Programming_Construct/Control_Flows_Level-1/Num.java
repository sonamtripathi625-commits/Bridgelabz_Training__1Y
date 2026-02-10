import java.util.Scanner;
class Num
{
public static void main(String args[])
{
Scanner S=new Scanner(System.in);
System.out.println("Enter first num=");
int a=S.nextInt();
System.out.println("Enter second num=");
int b=S.nextInt();
System.out.println("Enter third num=");
int c=S.nextInt();
System.out.println("Max value");
if(a>b &&a>c){
System.out.println(a);
}
else if (b>c){
System.out.println(b);
}
else{
System.out.println(c);
}
 }
}
