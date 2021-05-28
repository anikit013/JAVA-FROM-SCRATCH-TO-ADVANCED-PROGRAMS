// Display CommonElements in an array
class CommonElements 
{
	public static void main(String[] args) 
	{
		int[] num1={12,34,2,23,12};
		int[] num2={32,34,12,32,12};
		CommElements(num1,num2);
	}
	public static void CommElements(int[] a, int[] b)
			{
		int i=0;
		int j=0;
		for (;i < a.length;i++)
		{
			for ( ;j < b.length; j++)
			{
				if (a[i]==b[j])
				{
					System.out.println(a[i]+" is the common elements ");
				}
			}
		}
	}
}