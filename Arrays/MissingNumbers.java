//Program to print all missing number in  a given array of stored numbers 
class MissingNumbers 
{
	public static void main(String[] args) 
	{
		int[] a={1,2,4,6,3,7,8};
		missing(a);
		
	}
	public static void missing(int[] a)
	{
		int sum=0;
		for(int i=0 ; i <a.length ; i++)
		{
			for(int j =i+1 ; j<a.length ; j++)
			{
				if (a[i] +1 != a[j])
				{
					sum= a[i] +1;
				}
			   
			}
			
		}
		 
		System.out.print(sum + " ");
		
	}
}
