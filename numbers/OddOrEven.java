import java.util.Scanner;
class OddOrEven  
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		if(isOddEven(num))
		{
			System.out.println("The number is even");
		}
		else
		{
			System.out.println("The number is odd");
		}

	}
	public static boolean isOddEven(int num)
	{
		return num%2==0?true:false;
	}
}
