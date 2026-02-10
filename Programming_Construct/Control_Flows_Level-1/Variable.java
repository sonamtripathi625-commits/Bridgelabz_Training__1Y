import java.util.Scanner;
class Variable 
{
public static void main(String args[])
{
Scanner V=new Scanner(System.in);
System.out.println("Enter a variable=");
int num=V.nextInt();
if(num>0){
System.out.println("positive no.");
}
else if (num<0){
System.out.println("Negative no.");
}
else if (num==0){
System.out.println("Zero");
}
else{
System.out.println(" ");
}
 }
}