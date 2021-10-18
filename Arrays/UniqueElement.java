//Program to print all the Unique elements in an array
class UniqueElement
{
	public static void main(String[] args) 
	{
		int[] a={10,20,2,20,3,4,2};
		for(int i:a)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("The unique elements in array are");
		uniqueOcc(a);
	}
	public static void uniqueOcc(int[] a)
	{
		for(int i =0; i<a.length; i++)
		{
			int count=1;
			if(a[i] !=-1)
			{
				for(int j =i+1 ; j<a.length ; j++)
				{
					if(a[j] !=-1)
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
					System.out.print(a[i]+" ");   
				}
				
			}
		}
	}
}
