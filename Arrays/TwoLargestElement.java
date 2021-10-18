//Program to find the first and second largest element in an array 
class TwoLargestElement 
{
	public static void main(String[] args) 
	{
		int[] a={10,22,2,3,4,99,101,2,0,8};
		System.out.print("The array elements are:");
		for(int i :a)
		{
			System.out.print(i+" ");
		}
		System.out.println();

		largestFirstSecond(a);
	}
	public static void largestFirstSecond(int[] a)
	{
		int fmax=0;
		int smax=0;
		for(int i =0 ;i<a.length ; i++)
		{
			if(a[i] > fmax)
			{
				smax=fmax;
				fmax=a[i];
			}
			else if(a[i] >smax && a[i]!=fmax)
			{
				smax=a[i];
			}
		}
		System.out.println("The First Largest Element is "+fmax);
		System.out.println("The Second Largest Element is "+smax);
	}
}
