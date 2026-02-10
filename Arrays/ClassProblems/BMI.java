import java.util.Scanner;
class BMI
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a no. of person");
int n=sc.nextInt();

for(int i=0;i<n;i++){

System.out.println("Enter a height"(i+1));
double height= sc.nextDouble();
System.out.println("Enter a weight"+(i+1));
double weight[]=sc.nextDouble();}
for(int i=0;i<n;i++){
double BMI=weight/(height*height);
if(BMI<=18.4){
System.out.println("Underweight");
}
else if (BMI>=18.5 && BMI<=24.9){
System.out.println("Normal");
}
else if(BMI>=25.0 && BMI<=39.9){
System.out.println("Overweight");
}
else if (BMI>=40.0){
System.out.println("Obese");
}
else{
System.out.println("not included");
}
 }
}
}
