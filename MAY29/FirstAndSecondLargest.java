// First and Second  largest element of an array
class FirstAndSecondLargest

{
	public static void main(String[] args) 
	{
		int[] a={1,4,23,3,5,12};
		Largest(a);
		System.out.println(" ");
	}
	public static void Largest(int[] a)
	{
		int fmax=0;
		int smax=0;
		for (int i=0;i <a.length;i++)
		{
			if(a[i] >fmax)
			{
				smax=fmax;
				fmax=a[i];
			}
			else if(a[i]> smax && a[i]!=fmax)
			{
				smax=a[i];
			}
		}
		System.out.println(fmax);
		System.out.println(smax);

		}
}
