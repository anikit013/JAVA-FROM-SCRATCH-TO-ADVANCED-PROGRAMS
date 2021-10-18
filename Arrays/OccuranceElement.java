//Program to print the number of  occurance  of an element in an array
class OccuranceElement  
{
	public static void main(String[] args) 
	{
		int[] a={10,2,3,4,2,4,5,10};
		printOccrance(a);
		
	}
	public static void printOccrance(int[] a)
	{
		for(int i=0 ; i<a.length ; i++)
		{
			int count=1;
			if(a[i] != -1)
			{
				for(int j=i+1; j<a.length ;j++)
				{
					if(a[j]!= -1)
					{
						if(a[i]==a[j])
						{
							count++;
							a[j]=-1;
						}
					}
				}
				System.out.println(a[i] +" occurs " + count + " times");
			}
		}
	}
}
