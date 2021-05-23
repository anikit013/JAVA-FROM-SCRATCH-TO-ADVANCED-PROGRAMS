//WAP to printReverseArratChar
class ReverseArrayChar

{
	public static void main(String[] args) 
	{
	 char[] a={'a','e','i', 'o', 'u'};
	 System.out.println("Before Swapping");
	 for (char i : a )
	 {
		 System.out.println(i);
	 }
		reverse(a);
	System.out.println("After Swapping");
	for (char i : a )
	{
		System.out.println(i);
	}
	}
	public static void reverse(char[] a)
	{
		for (int i=0;i < a.length/2;i++)
		{
			char temp=a[i];
			a[i]=a[a.length - 1 - i];
			a[a.length -1 - i]= temp;
		}
	}
}
