import java.util.Scanner;
class Sum
{
	public static void main(String args[])
	{
		Scanner ref=new Scanner(System.in);
		System.out.println("Enter a number=");
		int n=ref.nextInt();
		int count=0;
	if(n==0){
	count=1;}
	else{
	while(n>0){
		count++;
			
			n=n/10;
			
		}
	}
	System.out.println(count);
	
	 }
}