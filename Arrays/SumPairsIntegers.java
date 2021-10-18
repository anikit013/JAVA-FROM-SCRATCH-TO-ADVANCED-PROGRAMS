//Program to find the pairs of integers in the array whose sum is equal to given sum 
class SumPairsIntegers  
{
	public static void main(String[] args) 
	{
		int[] a={1,2,3,4,5,6,9,20};
		int sum=5;
		System.out.println("The Array Elements are:");
		for(int i : a)
		{
			System.out.print(i+ " ");
		}
		System.out.println();
		System.out.println("The sum is: "+sum);
		sumPairs(a,sum);
	}
	public static void sumPairs(int[] a,int sum)
	{
		for(int i=0 ; i < a.length ; i++)
		{
			for(int j = i+1 ; j <a.length ; j++)
			{
				if(a[i] + a[j] == sum )
				{
					System.out.println(" Pair found ("+a[i] + "," + a[j] + ")");
				}
			}
		}
	}
}
