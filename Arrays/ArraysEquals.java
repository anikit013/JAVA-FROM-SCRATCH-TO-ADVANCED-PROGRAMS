
class ArraysEquals 
{
	public static void main(String[] args) 
	{
		int[] a={10,20,30,40,50};
		int[] b={10,20,30,40,50};
		compareArrays(a,b)
	

	
	public static void compareArrays(int[] a,int[] b)
	{

			for(int i=0 ; i<a.length ;i++)
			{
			  if(a[i]=b[i])
		      {
				      System.out.println(a[i]);
			  }
		}
	}
}
