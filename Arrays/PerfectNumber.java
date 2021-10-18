//Program to print all the perfect numbers in an array of postive integers
class PerfectNumber 
{
	public static void main(String[] args) 
	{
		int[] a={1,6,4,5,9};
		int[] temp =a;
		System.out.println("The Array elements are:");

		for(int i:a)
		{
			System.out.println(i);
		}
		System.out.println();

		for(int num : a)
		{
			if(isPerfect(num))
			{
				System.out.println(num+" is perfect number");
			}
		}
	}
	public static boolean isPerfect(int num)
	{
		int sum=0;
		for(int i=1;i<num;i++)
		{
			if(num % i == 0 )
			{
				sum=sum+i;
			}
		}
		return num==sum ? true : false;
	}
}
