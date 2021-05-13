//  Swap two number without using 3rd operator
import java.util.*;
class SwapTwoNumbers
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println(" Enter First Number ");
		int num1= sc.nextInt();
		System.out.println(" Enter Second Number ");
		int num2= sc.nextInt();
		System.out.println(" Before Swapping it was  " + num1 + " , " + num2);
		LogicSwapTwoNumbers(num1,num2);
		
	}

	public static void LogicSwapTwoNumbers(int num1, int num2)
	{
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println(" After Swapping it is  " + num1 + " , " + num2);


	}
}
