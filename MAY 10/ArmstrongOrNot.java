// to determine the ArmstrongNumberOrNot
import java.util.Scanner;
class ArmstrongOrNot  
{
	public static void main(String[] args) 
	{
	Scanner sc= new Scanner(System.in);
	
	 int num= sc.nextInt();
	 int count=LogicGetCount(num);
	 if (LogicArmstrong(num,count))
		{
			System.out.println(" The number is  Armstrong ");
		}
		else
		{
			System.out.println(" The number is not a Armstrong ");
		}
	}
}

	public static int LogicGetCount(int num)
	{
		int count=0;
		while (num>0)
		{
			count++;
			num/=10;
		
		}
		return count;
		}
}
	public static boolean LogicArmstrong(int num, int count)
	{
		int sum=0;
		int temp=num;
		while (num>0)
		{
			sum=sum+(int)Math.pow(num%10,count);
			num/=10;
		}
		return (sum== temp) ? true :  false ;
	}
} 

