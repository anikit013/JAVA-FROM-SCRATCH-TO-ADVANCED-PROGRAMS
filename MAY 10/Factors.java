//Program to print all the factors of given num
import java.util.Scanner;
class  Factors
{
	public static void main(String[] args) 
	{
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter a number:");
	   int num=sc.nextInt();
	   printFactors(num);

	}
	public static void printFactors(int num)
	{
		for(int i=1;i<=num;i++)
		{
			if(num%i == 0)
			{
					System.out.println(i);
			}
		}
	}
}
