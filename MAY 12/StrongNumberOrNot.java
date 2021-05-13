// to determine a strong number from 1 to 1000
import java.util.Scanner;
class StrongNumberInBetween
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println(" Enter a number ");
		int num= sc.nextInt();
		 if(IsStrong(num))
		{
			System.out.println( " This is Strong number ");
		}
		else
		{
			System.out.println( " This is Strong number ");
		}
	}
	public static boolean IsStrong( int num)
	{
		int sum=0;
		int temp=num;
		while (num>0)
		{
			sum=sum+ fact(num%10);
			num=num/10;
		}
		return temp==sum ? true : false;
	}
	public static int fact(int num)
	{
		int fact=1;
		for (int i=1; i<=num ; i++)
		{
			fact= fact*i;
		}
		return fact;
}
}
