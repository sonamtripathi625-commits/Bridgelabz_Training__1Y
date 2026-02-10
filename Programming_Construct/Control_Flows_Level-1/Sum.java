import java.util.Scanner;
class Sum
{
public static void main(String args[])
{
Scanner S=new Scanner(System.in);
System.out.println("Enter a positive integer=");
int integer=S.nextInt();
if(integer>=0){
  int sum= integer*(integer+1)/2;
System.out.println("natural no."+sum);
}
else
{
System.out.println("not a natural no.");
}
 }
}