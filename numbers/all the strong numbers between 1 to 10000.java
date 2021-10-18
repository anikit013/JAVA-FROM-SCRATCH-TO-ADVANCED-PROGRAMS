//Program to print all the strong numbers between 1 to 10000
class Assg1_3
{
	public static void main(String[] args) 
	{
		for(int i=1 ; i<=10000 ; i++)
		{
			if(isStrong(i))
			{
				System.out.println(i+" is a Strong Number");
			}
		}
	}
	public static boolean isStrong(int num)
	{
		int rem,sum=0;
		int temp=num;
		while(num>0)
		{
			sum=sum+fact(num%10);
			num=num/10;
		}
		return temp==sum ? true : false;
	}
	public static int fact(int num)
	{
		int fact=1;
		for(int i=1 ; i<=num ; i++)
		{
			fact=fact*i;
		}
		return fact;
	}
}
