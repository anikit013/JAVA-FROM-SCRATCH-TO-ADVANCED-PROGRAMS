//Program to print the first duplicate strings in a given strings of an array
class FirstStringDuplicateElement 
{
	public static void main(String[] args) 
	{
		String[] a={"hello","hii","hello","isss","hii","program","program"} ;
		for(String i:a)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("The first duplicate elements in array is");
		duplicateOcc(a);
	}
	public static void duplicateOcc(String[] a)
	{
		for(int i =0; i<a.length; i++)
		{
			int count=1;
			if(a[i] !="done")
			{
				for(int j =i+1 ; j<a.length ; j++)
				{
					if(a[j] !="done")
					{
						if(a[i]==a[j])
						{
							count++;
							a[j]="done";
						}
					}
				}
			    if(count>1)
				{
				System.out.println(a[i]+" occurs "+count+" times");
				return;
				}
					
				
			}
		}
	}
}

