import java.util.Scanner;
class PrimeOrNot
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st range of prime number");
		System.out.println("Enter the 2st range of prime number");
		int num1=sc.nextInt();
		int num2 =sc.nextInt();
		for(int num=num1 ; num<=num2 ; num++)
		{
			if(isPrime(num))
			{
				System.out.println(num+ " is a prime number");
			}
		}
	}
	public static boolean isPrime(int num)
	{
		for(int i=2;i<num;i++)
		{
			if(num%i == 0)
			{
				return false;
			}
		}
		return true;
	}
}