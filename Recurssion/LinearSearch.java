//Program to search a key element in an array using liner search
class  LinearSearch
{
	public static void main(String[] args) 
	{
		int[] a={10,20,30,40,50};
		int key=60;
		int i=0;
		if(linear(a,i,key))
		{
			System.out.println("Key Found");
		}
		else
		{
			System.out.println("Key not Found");
		}
	}
	public static boolean linear(int[] a,int i,int key)
	{
		if(i>=a.length)
		{
			return false;
		}
		else if(a[i]==key)
		{
			return true;
		}
		else
		{
			return linear(a,i+1,key);
		}
	}
}
