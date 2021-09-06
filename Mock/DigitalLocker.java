import java.util.Scanner;
class DigitalLocker 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Digital lock number ");
		int num =sc.nextInt();
		

		if(isArmstrong(num,getCount(num)))
		{
			even(num);
		}
		else
		{
			odd(num);
		}
	}



	public static void even(int num)
	{
		int sum=0;
		
		while(num>0)
		{
			int x=num%10;
			
			if((x)%2==0)
			{
				sum=sum+x;
			}
			num=num/10;

		}
		System.out.println(sum);
	}




	public static void odd(int num)
	{
		int sum=0;
		while(num>0)
		{
			int x=num%10;
			if((x)%2!=0)
			{
				sum=sum+x;
			}
			num=num/10;

		}
		System.out.println(sum);
	}

	public static int getCount(int num)
	{
		int count=0;
		while(num>0)
		{
			count++;
			num/=10;
		}
		return count;
	}



	public static boolean isArmstrong(int num,int count)
	{
		int sum=0,temp=num;
		while(num>0)
		{
			sum=sum+(int)Math.pow(num%10,count);
			num/=10;

		}
		return sum==temp?true:false;
	}
}
