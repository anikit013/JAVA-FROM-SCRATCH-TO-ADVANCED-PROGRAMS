//Program to compare arrays without using Arrays.equal
class ArraysEquals1 
{
	public static void main(String[] args) 
	{
		int[] a={10,20,30,40,50};
		int[] b={10,20,30,40,50};
		if(compareArrays(a,b))
		{
			System.out.println("Arrays are equal");
		}
		else
		{
			System.out.println("Arrays are not equal");
		}
	}

	
	public static boolean compareArrays(int[] a,int[] b)
	{
		if(a.length!=b.length)
		{
			return false;
		}
		else
		{
			for(int i=0 ; i<a.length ;i++)
			{
			  if(a[i]!=b[i])
		      {
				      return false;
			  }
		    }
			return true;
		}
	}
}
