// to determine  whether a number is odd or even
import java.util.Scanner;
class OddOrEven 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println(" Enter a number ");
		int num= sc.nextInt();
		if(OddOrEvenLogic(num))
		{
			System.out.println(" Yeah it is odd ");
		}
		else
		{
			System.out.println(" Yessss it is even");
		}
	}
	public static boolean OddOrEvenLogic(int num)
	{
		return ((num/2)*2==num) ? false : true ; 
	}
}

		//return  (num & 1) == 0 ? false : true;

		/*for (int i=0;i>num ; i--)
		{
			num=num-2;
		}
		return (num==0) ? false : true;
		
		/*return (num%2==0) ? false : true;
		
		
		/*
		if (num%2==0)
		{
			return false;
		}
		else 
		{ return true;}
		*/
