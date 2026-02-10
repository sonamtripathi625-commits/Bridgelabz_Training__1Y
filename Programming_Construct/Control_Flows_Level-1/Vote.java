import java.util.Scanner;
class Vote
{
public static void main(String args[])
{
Scanner V=new Scanner(System.in);
System.out.println("Enter your age=");
int age=V.nextInt();
if(age>=18){
System.out.println("can vote");
}
else{
System.out.println(" cannot vote");
}
 }
}
