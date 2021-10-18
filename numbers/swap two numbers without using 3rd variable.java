//Program to swap two numbers without using 3rd variable
import java.util.Scanner;
class Assg1_7 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First Number");
		int num1=sc.nextInt();
		System.out.println("Enter the Second Number");
		int num2=sc.nextInt();
		swap(num1,num2);

		
	}
	public static void swap(int num1,int num2)
	{
        System.out.println("Before Swapping  number is ");
		System.out.println(num1);
		System.out.println(num2);
		num1 = num1 + num2;
		num2= num1 - num2;
		num1=num1 - num2;
		System.out.println("The swapped number is ");
		System.out.println(num1);
		System.out.println(num2);
		}
}
