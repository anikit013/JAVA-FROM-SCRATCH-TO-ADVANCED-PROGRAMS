//Program to print all the perfect numbers between 1 to 1000
class Assg1_1 
{
	public static void main(String[] args) 
	{
	    
		for(int i =1 ; i<=1000 ; i++)
		{
			if(isPerfect(i))
			{
					System.out.println(i+" is a perfect number");
			}
			
		}

	}
	public static boolean isPerfect(int num)
	{
		int sum=0;
		int temp=num;
		for(int i=1 ; i< num ; i++)
		{
			if(num % i == 0 )
			{
				sum=sum+i;
			}
		}
		return sum==temp ? true : false;
	}
}
