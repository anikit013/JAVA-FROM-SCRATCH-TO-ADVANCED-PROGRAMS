//write a program to print the pairs of integers in the array whose sum is equal to given Sum  
class SumEqualsSum
{
	public static void main(String[] args)
	{
		int[] a= {1,5,7,-1};
		int sum=6;
		for (int i:a)
		{
			System.out.println(" The provided array is "+i);
		}
		System.out.println(" And the sum is "+sum);
		SumSum(a,sum);
	}
	public static void SumSum(int[] a, int sum)
	{
		for (int i=0;i < a.length;i++)
		{
			for (int j=i+1;j <a.length ;j++)
			{
				if (a[i]+a[j]==sum)
				{
					System.out.println( " The sum of ("+a[i]+" "+a[j]+")");
				}
			}
		}
	}
}
