class NumOfDuplicateOccurence 
{
	public static void main(String[] args) 
	{
		String[] a={"hi","bye","hello","hi","bye","hello","okay","superb","hi"};
		printDuplicateOccurence(a);
	}
	public static void printDuplicateOccurence(String[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			int count=1;
			if(a[i]!="")
			{
				for(int j=i+1;j<a.length;j++)
				{
					if(a[j]!="")
					{
						if(a[i]==a[j])
						{
							count++;
							a[j]="";
						}
					}
				}
				if(count>1)
				{
					System.out.println(a[i]+" is Duplicate Element & occurs "+count+" time only");
				}
			}
		}
	}
}
