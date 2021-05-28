class RemoveAllDuplicates 
{
	public static void main(String[] args) 
	{
		int[] a={5,4,3,4,5,2,6};
		for(int i:a)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		
		RemoveAllDuplicates(a);
	}
	public static void RemoveAllDuplicates(int[] a)
	{
		int[] t=new int[a.length];
		for(int i=0;i<t.length;i++)
		{
			t[i]=a[i];
		}
		int c=getCount(a);
		int[] b=new int[t.length-c];
		int k=0;
		for(int i=0;i<t.length;i++)
		{
			int count=1;
			if(t[i]!=-1)
			{
				for(int j=i+1;j<t.length;j++)
				{
					if(t[j]!=-1)
					{
						if(t[i]==t[j])
						{
							count++;
							t[j]=-1;
						}
					}
				}
					if(k<b.length)
					{
						b[k]=t[i];
						k++;
					}
					
				}
			}
		for(int i:b)
		{
			System.out.print(i+" ");
		}
	}
	public static int getCount(int[] a)
	{
		int c=0;
		for(int i=0;i<a.length;i++)
		{
			int count=1;
			if(a[i]!=-1)
			{
				for(int j=i+1;j<a.length;j++)
				{
					if(a[j]!=-1)
					{
						if(a[i]==a[j])
						{
							count++;
							a[j]=-1;
						}
					}
				}
				if(count>1)
				{
					c++;
				}
			}
		}
		return c;
	}
}
