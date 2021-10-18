//Program to find the first and second smallest element in an array 
class TwoSmallestElement 
{
	public static void main(String[] args) 
	{
		int[] a={10,22,2,3,4,99,101,2,1,8,0};
		System.out.print("The array elements are:");
		for(int i :a)
		{
			System.out.print(i+" ");
		}
		System.out.println();

		smallestFirstSecond(a);
	}
	public static void smallestFirstSecond(int[] a)
	{
		int fmin=99;
		int smin=99;
		for(int i =0 ;i<a.length ; i++)
		{
			if(a[i] <fmin)
			{
				smin=fmin;
				fmin=a[i];
			}
			else if(a[i] < smin && a[i]!=fmin)
			{
				smin=a[i];
			}
		}
		System.out.println("The First Smallest Element is "+fmin);
		System.out.println("The Second Smallest Element is "+smin);
	}
}

