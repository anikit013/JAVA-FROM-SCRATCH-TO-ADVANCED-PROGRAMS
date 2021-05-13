//To check whether the given number is automorphic or not
import java.util.*;
class AutomorphicOrNot
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner (System.in);
		System.out.println(" Enter a number ");
		int num=sc.nextInt();
		if (LogicArmstrong(num))
		{
		System.out.println(num + " is a Automorphic Number ");
		}
		else
		{ 
			System.out.println(num + " is not a Automorphic Number ");
		}
	}
		public static boolean LogicArmstrong(int num)
		{
			int square= num*num;
			while (num>0)
			{
				if (num%10 != square%10)
				{
					return false;
				}
			num=num/10;
			square=square/10;
			}
			return true;
		}
}



