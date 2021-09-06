import java.util.*;
class YesBank 

{
	public static void main(String[] args) 
	{
		int sum=0;
		int fact=0;


		Scanner sc= new Scanner(System.in);
			System.out.println(" Enter the number");
			int arm=sc.nextInt();
			int temp=arm;
		{
			for (int a:arm)
			{
				fact=fact*a;

				
			}
			if (temp==arm)
			{
				for (int t:temp)
				{
					if (t%2==0)
					{
						sum=sum+t;
					}
				}
			System.out.println(sum);
				}
				
	 else
		{
	if (temp!=arm)
	{
		for (int o:temp)
		{
			if (t%2!=0)
			{
				sum=sum+t;
			}
		}
		System.out.println(sum);
	}
		}
		}
	}
}
			
