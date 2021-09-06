import java.util.Scanner;
class SeperateCharacters 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=sc.nextLine();
		System.out.println();
		System.out.println("Output: ");
		
		System.out.println(seperate(s));
	}
	public static String seperate(String s)
	{
		String seperate="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if((c>='A' && c<='Z')||(c>='a' && c<='z'))
			{
				seperate=seperate+c;
			}
		}
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if((c>='0' && c<='9'))
			{
				seperate=seperate+c;
			}
		}
		
		return seperate;
	}
}