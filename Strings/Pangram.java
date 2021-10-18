//Program to check whether the given string is Pangram or not
class Pangram 
{
	public static void main(String[] args) 
	{
		String s="The quick brown fox jumps over the lazy dog";
		if(isPangram(s))
		{
			System.out.println("Strings are pangram");
		}
		else
		{
			System.out.println("Strings are not pangram");
		}
	}
	public static boolean isPangram(String s)
	{
		boolean[] b=new boolean[26];
		 index;
		for(int i =0 ; i<s.length() ; i++)
		{
			if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
			{
				index=s.charAt(i)-'A';
			}
			if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
			{
				index=s.charAt(i)-'a';
			}
			b[index]=true;
		}
	}
}

