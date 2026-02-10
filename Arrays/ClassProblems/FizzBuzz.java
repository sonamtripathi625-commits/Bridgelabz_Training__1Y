import java.util.* ;
class FizzBuzz
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number=");
		int n=sc.nextInt();
		if(n>0)
		{
			System.out.println("Invailed");
			return;
		}
		String result[]=new String [n];
		for(int i=0;i<n;i++)
		{
			if(i%3==0&&i%5==0){
			result[i+1]="FizzBuzz";}
			else if (i%3==0){
			result[i+1]="fizz";}
			else if(i%5==0){
				result[i+1]="Buzz";
		}
			else{
				result[i+1]=String.valueOf(i);
			}
			
		}	
	}
}
				
		