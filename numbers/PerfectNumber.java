//Program to check whether the given number is perfect number or not
import java.util.Scanner;
class PerfectNumber
{
	public static void main(String[] args) 
	{
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter a number:");
	   int num=sc.nextInt();
	   if(perfect(num))
	   {
		   System.out.println(num+ " is a perfect number");
	   }
	   else
		{
		   System.out.println(num+ " is not a perfect number");
		}



	}
	public static boolean perfect(int num)
	{
		int sum=0;
		for(int i=1;i<num;i++)
		{
			if(num % i == 0 )
			{
				sum=sum+i;
			}
		}
		return num==sum ? true : false;
	}
}
