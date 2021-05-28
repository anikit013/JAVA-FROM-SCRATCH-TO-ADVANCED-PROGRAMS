//WAP to print NumOfFirstUniqueOccurence
class NumOfFirstUniqueOccurence 

{
	public static void main(String[] args) 
	{
		int[] a={5,3,2,5,3,1};
		printFirstUniqueOccurence(a);
	}
	public static void printFirstUniqueOccurence(int[] a)
	{
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
				if(count==1)
				{
					System.out.println(a[i]+" is the First Unique Element & occurs "+count+" time only");
					break;
				}
			}
		}
	}
}
