//Program to find factorial of a given num
import java.util.Scanner;
class  Factorial
{
	public static void main(String[] args) 
	{
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter a number:");
	   int num=sc.nextInt();
	   int a =fact(num);
	   System.out.println("The factorial of a number is "+a);


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
