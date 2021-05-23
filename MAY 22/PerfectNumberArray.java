//WAP to print a perfect Number 
class PerfectNumberArray
{
	public static void main(String[] args) 
	{
		int[] a ={2,6,8,74,38};
		
		for (int num : a)
		{
		if (logicIsArray(num))
		{
			System.out.println(num + " is a perfect Number ");
		}
		}
	}

	public static boolean logicIsArray(int num)
	{
		int sum=0;
		for (int i=1;i<num;i++)
		{
			if (num % i == 0)
			{
				sum= sum + i;
			}
		}
		return (sum==num) ? true : false;
		}
	
}
