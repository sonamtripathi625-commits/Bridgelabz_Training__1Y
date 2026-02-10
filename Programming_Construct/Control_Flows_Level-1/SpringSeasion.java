import java.util.Scanner;
class SpringSeasion
{
public static void main(String args[])
{
Scanner S=new Scanner(System.in);
System.out.println("Enter a date");
int date=S.nextInt();
System.out.println("Enter a month=");
int month=S.nextInt();

if(month==3&& date<=20){
System.out.println("springseasion");
}

else if(month==4 && date<=30){
System.out.println("springseasion");
}

else if (month==5&& date<=31){
System.out.println("springseasion");
}

else if(month==6&& date<=20){
System.out.println("springseasion");
}
else{
System.out.println("not springseasion");
}
 }
}

 