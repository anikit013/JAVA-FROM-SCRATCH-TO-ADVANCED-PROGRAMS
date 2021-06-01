// Write a program to find First and Second  Smallest element of an array
class FirstAndSecondSmallest

{
	public static void main(String[] args) 
	{
		int[] a={1,3,4,4,23,3,5,12};
		Largest(a);
		System.out.println(" ");
	}
	public static void Largest(int[] a)
	{
		int fmin=99;
		int smin=99;
		for (int i=0;i <a.length;i++)
		{
			if(a[i] <fmin)
			{
				smin=fmin;
				fmin=a[i];
			}
			else if(a[i]< smin && a[i]!=fmin)
			{
				smin=a[i];
			}
		}
		System.out.println(fmin+" is the smallest and "+smin+" is the second smallest ");

		}
}
