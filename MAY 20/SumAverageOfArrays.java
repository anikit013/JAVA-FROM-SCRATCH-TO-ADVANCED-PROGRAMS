// TO PRINT SUM AND AVERAGE OF AN ARRAYS
class SumAverageOfArrays 
{
	public static void main(String[] args) 
	{
		int[] a= {10,11,12,13,14};
		sumAvg(a);
	}
		public static void sumAvg(int a[])
	{		int length=0;
			int sum=0;
			for(int i :a)
		{
				sum+=i;
				length++;
		}
		System.out.println(" Sum is " + sum + " And Average is " + sum/length);
	}
}
