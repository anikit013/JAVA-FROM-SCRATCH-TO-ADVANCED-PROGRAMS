//Program to print all missing number in  a given array of stored numbers 
class MissingNumber
{
	public static void main(String[] args) 
	{
		int[] a={1,2,4,6,3,7,8};
		System.out.print("The array elements are:");
		for(int i :a)
		{
			System.out.print(i+" " );
		}
		System.out.println();
		int num=missing(a);
		System.out.println("The missing number in an array is "+num);
		
		
	}
	public static int missing(int[] a)
	{
		int n= a.length+1;
		int sum = n * ( n+1) /2;
		int sum1=0;	
		for(int i=0 ; i <a.length ; i++)
		{
			sum1=sum1+a[i];
		}
		int missing_num=sum-sum1;
	    return missing_num;
	}
}
