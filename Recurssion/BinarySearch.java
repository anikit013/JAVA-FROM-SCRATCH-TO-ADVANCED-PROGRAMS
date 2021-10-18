//Program to find a given element in an array using binary search
class BinarySearch 
{
	public static void main(String[] args) 
	{
		int[] a={10,20,30,40,50};
		int key=10;
		int low=0;
		int high=a.length-1;
		if(binary(a,low,high,key))
		{
			System.out.println("Key Found");
		}
		else
		{
			System.out.println("Key Not Found");
		}
	}
	public static boolean binary(int[] a ,int low,int high,int key)
	{
		int mid=(low+high)/2;
		if(low>=high)
		{
			return false;
		}
		else if (key==a[mid])
		{
			return true;
		}
		else if(key>a[mid])
		{
			return binary(a,mid+1,high,key);
		}
		else
		{
			return binary(a,low,mid-1,key);
		}
	}
}
