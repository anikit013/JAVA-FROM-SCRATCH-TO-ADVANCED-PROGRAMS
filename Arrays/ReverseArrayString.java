//WAP to printReverseArrayString
class ReverseArrayString

{
	public static void main(String[] args) 
	{
	 String[] a={"ana","mae","eko", "sds","ddu"};
	 System.out.println("Before Swapping");
	 for (String i : a )
	 {
		 System.out.println(i);
	 }
		reverse(a);
	System.out.println("After Swapping");
	for (String i : a )
	{
		System.out.println(i);
	}
	}

	public static void reverse(String[] a)
	{
		for (int i=0;i < a.length/2;i++)
		{
			String temp=a[i];
			a[i]=a[a.length - 1 - i];
			a[a.length -1 - i]= temp;
		}
	}
}
