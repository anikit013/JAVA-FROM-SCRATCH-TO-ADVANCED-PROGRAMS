//Program to check  a number is odd or even
import java.util.Scanner;
class ProgramOddEven  
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		if(isOddEven(num))
		{
			System.out.println(num+ " is even number");
		}
		else
		{
			System.out.println(num+ " is odd number");
		}

	}
	public static boolean isOddEven(int num)
	{
		//return num%2==0 ? true : false;

		//return num/2*2==num ? true : false; 

		//return  (num & 1) == 0 ? true : false;

		/*if(num/2*2 == num)
		{
			return true;
		}
		else
		{
			return false;
		}*/

		//return (num & 1) ==0;

		//return num %2 ==0;

		return num/2*2==num;
	}
}
