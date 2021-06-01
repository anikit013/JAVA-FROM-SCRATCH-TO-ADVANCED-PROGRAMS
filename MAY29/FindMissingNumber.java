// write a program to determine the missing numbers in a given sorted array 
	class FindMissingNumber
	{
	public static void main(String[] args) 
	{
		int[] a= {1,2,3,4,5,7,8};
		for (int i:a)
		{
			System.out.println(" The array are " +i);
		}

		System.out.println(" And the missing numbers are ");
		MissingNumber(a);
	}
	public static void MissingNumber(int[] a)
	{
		int sum=0;
		int n= a.length +1;
		int totalsum=(n*(n+1))/2;
		//int totalsum=((a[a.length-1]*a[a.length-1]+1))/2;
		for (int i:a )
		{
			sum=sum+i;
		}
		System.out.println("Misiing Number from "+a[0]+" to "+a[a.n-1]+" is "+(totalsum-sum));
	}
}