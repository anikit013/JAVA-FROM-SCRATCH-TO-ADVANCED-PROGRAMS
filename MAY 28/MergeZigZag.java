//Program to merge the array in zigzag manner
class MergeZigZag  
{
	public static void main(String[] args) 
	{
		int[] a={10,20,30,40,50};
		int[] b={100,200,300};
		int[] nArr=merge(a,b);
		for(int i :nArr)
		{
			System.out.print(i+" ");
		}
	}
	public static int[] merge(int[] a ,int[] b)
	{
		int[] res=new int[a.length+b.length];
		int i=0 , j=0;
		//when a.length=b.length
		for( ; i<a.length && i<b.length ;i++,j++)
		{
			res[j]=a[i];
			j++;
			res[j]=b[i];
		}
		//when a.length>b.length
		if(a.length>=i)
		{
			while(i<a.length)
			{
				res[j]=a[i];
				j++;
				i++;
			}
		}
		//when a.length<b.length
		if(b.length>=i)
		{
			while(i<b.length)
			{
				res[j]=b[i];
				j++;
				i++;
			}
		}
		return res;
	}



}
