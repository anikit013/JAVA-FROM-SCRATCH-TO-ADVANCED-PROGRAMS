class NumOfFirstDuplicateOccurence 
{
	public static void main(String[] args) 
	{
		String[] a={"bye","hello","hi","hello","okay","superb","hi"};
		printFirstDuplicateOccurence(a);
	}
	public static void printFirstDuplicateOccurence(String[] a)
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
					System.out.println(a[i]+" is First Duplicate Element & occurs "+count+" time only");
					break;
				}
			}
		}
	}
}
