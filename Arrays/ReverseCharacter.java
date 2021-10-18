//Program to Reverse array of character
class ReverseCharacter 
{
	public static void main(String[] args) 
	{
		char[] ch={'a','e','i','o','u'};
		System.out.println("Before Reversing");
		for(char i:ch)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("After Reversing");
		reverse(ch);

		for(char i : ch)
		{
			System.out.println(i+"");
		}
		System.out.println();
	}
	public static void reverse(char[] ch)
	{
		for(int i=0 ; i< ch.length/2 ; i++)
		{
			char temp= ch[i];
			ch[i] = ch[ch.length - 1 -i];
			ch[ch.length - 1 -i]=temp;
		}
	}


}
