//Program to check whether two stings are anagram or not
import java.util.Arrays;
class Anagram
{
	public static void main(String[] args) 
	{
		String s1="Silent" , s2="Listen";
		if(isAnagram(s1,s2))
		{
			System.out.println("Anagarm");
		}
		else
		{
			System.out.println("Not Anagram");
		}
	}
	public static String removeSpace(String s)
	{
		String nospace="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				nospace=nospace+s.charAt(i);
			}
			return nospace;
		}
	}
	public static boolean isAnagram(String str1,String str2)
	{

		if(str1.contains(" "))
		{
		    str1=removeSpace(s1);
		}
		if(str2.contains(" "))
		{
			 str2=removeSpace(s2);
		}

		str1=str1.toLowerCase();
		str2=str2.toLowerCase();

		char[] ch1=str1.toCharArray();
		char[] ch2=str2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);

		return Arrays.equals(ch1,ch2) ;
	}
	

}
