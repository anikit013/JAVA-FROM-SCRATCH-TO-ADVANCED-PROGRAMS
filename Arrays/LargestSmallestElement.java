//Program to find the largest and smallest element in an array
class LargestSmallestElement  
{
	public static void main(String[] args) 
	{
		int[] a={2,3,5,6,2,3,7,9,99,0};
		System.out.print("The Array Elements are ");
		for(int i:a)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		smallestElement(a);
		largestElement(a);
		
	}
	public static void largestElement(int[] a)
	{
		int max=a[0];
		for(int i=1 ; i<a.length ; i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("The Largest Element in an array is "+max);
	}
	public static void smallestElement(int[] a)
	{
		int min=a[0];
		for(int i=1 ; i<a.length ; i++)
		{
			if(a[i]<min)
			{
				min= a[i];
			}
		}
		System.out.println("The Smallest Element in an array is "+min);
	}
}
