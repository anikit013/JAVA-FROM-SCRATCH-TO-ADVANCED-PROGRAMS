//Program to remove specific index element in an array
class RemoveElement 
{
	public static void main(String[] args) 
	{
		int[] a={10,20,30,40,50};
		int[] res=removeEle(a,3);
		for(int i :a)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		for (int i:res )
		{
			System.out.print(i+" ");
		}
	}
	public static int[] removeEle(int[] a ,int pos)
	{
		int[] nArr=new int[a.length-1];
		int i=0;
		for( ; i<pos ; i++)
		{
			nArr[i]=a[i];
		}
		for( ; i<a.length ; i++)
		{
			nArr[i-1]=a[i];
		}
		return nArr;
	}
}
