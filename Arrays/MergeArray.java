//Program to merge two arrays into a single array
class MergeArray  
{
	public static void main(String[] args) 
	{
		int[] a ={10,20,30,40,50};
		int[] b={100,200,300,400};
		int[] res=merge(a,b);
		for(int i:a)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i : b)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i:res)
		{
			System.out.print(i+" ");
		}


	}
	public static int[] merge(int[] a ,int[] b)
	{
		int[] nArr=new int[a.length+b.length];
		int i=0;
		for( ; i<a.length ; i++)
		{
			nArr[i]=a[i];
		}
		for(int j=0 ; j<b.length ; j++ , i++)
		{
			nArr[i]=b[j];
		}
		return nArr;
	}
}
