//Program to multiply two number without using "*"
import java.util.Scanner;
class Assg1_8
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers to multiply:");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		multiply(num1,num2);

	
	}
	public static void multiply(int num1,int num2)
	{
		int sum=0;
		for(int i=1; i<=num1; i++)
		{
			sum=sum+num2;
		}
		System.out.println("The result is :"+sum);
	}

}
