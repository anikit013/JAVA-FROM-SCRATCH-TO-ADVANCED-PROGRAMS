// To check the number is perfect or not
import java.util.Scanner;
class PerfectOrNotMethod
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the number ");
		int num= sc.nextInt();
		for(int i=0; i=1000;i++){
		if (check.LogicPerfectOrNot(num))
		{
			System.out.println(" It is a Perfect number " + sum );
		}
		else {
			System.out.println(" It is not a perfect number");
	}
		}
}
}
class check
{
public static boolean LogicPerfectOrNot(int num)
	{
	int sum=0;
	int  temp=num;
	for( int i=1; i<num;i++)
		{
		if (num%i==0)
		{
			sum= sum+i;
		}
		
		}
		return (sum==temp) ? true : false ;
	}
}
