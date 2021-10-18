//Program to add an element at a specific position in an array
class AddElement 
{
	public static void main(String[] args) 
	{
		int[] a={10,20,30,40,50};
		int[] res=addAtSpecific(a,10,3);
		for(int i :a)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		for(int j:res)
		{
			System.out.print(j+" ");
		}
	}
	public static int[] addAtSpecific(int[] a,int ele,int pos)
	{
		int[] nArr=new int[a.length+1];
		int i=0;
		for( ; i<pos ; i++)
		{
			nArr[i]=a[i];
		}
		nArr[i]=ele;
		for( ;i<a.length;i++)
		{
			nArr[i+1]=a[i];
		}
		return nArr;
	}
}
