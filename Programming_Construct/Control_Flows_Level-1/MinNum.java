import java.util.Scanner ;
class MinNum
{
public static void main(String args[])
{
Scanner D=new Scanner(System.in);
System.out.println("Enter first num=");
int a=D.nextInt();
System.out.println("Enter second num=");
int b=D.nextInt();
System.out.println("Enter third num=");
int c=D.nextInt();
System.out.println("Min value");
if(b>a &&c>a){
System.out.println(a);
}
else if (b>c){
System.out.println(c);
}
else{
System.out.println(b);
}
 }
}