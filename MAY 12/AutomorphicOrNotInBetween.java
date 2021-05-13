//To check whether the given number is automorphic or not
import java.util.*;
class AutomorphicOrNotInBetween
{
	public static void main(String[] args) 
	{
		/*Scanner sc= new Scanner (System.in);
		System.out.println(" Enter a number ");
		int num=sc.nextInt();*/
		for (int i=1;i<=1000;i++)
		{
		if (LogicArmstrong(i))
		{
		System.out.println(i  + " is a Automorphic Number ");
		}
		}
	}
		public static boolean LogicArmstrong(int num)
		{
			int square=num*num;
			while(num>0)
			{
				if (num%10 != square%10)
				{
					return false;
				}
				square=square/10;
				num=num/10;
				}
				return true;
		}
}



