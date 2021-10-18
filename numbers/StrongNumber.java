//Program to whether a given num is strong number or not
import java.util.Scanner;
class  StrongNumber
{
	public static void main(String[] args) 
	{
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter a number:");
	   int num=sc.nextInt();
	  if(isStrong(num))
		{
		  System.out.println(num+" is a Strong Number");
		}
		else
		{
			System.out.println(num+" is  Not a Strong Number");
		}


	}
	public static boolean isStrong(int num)
	{
		int rem,sum=0;
		int temp=num;
		while(num>0)
		{
			sum=sum+fact(num%10);
			num=num/10;
		}
		return temp==sum ? true : false;
	}
	public static int fact(int num)
	{
		int fact=1;
		for(int i=1 ; i<=num ; i++)
		{
			fact=fact*i;
		}
		return fact;
	}
}
