import java.util.*;
class StringArray
{
	public static void main(String[] args) 
	{
		String[] s=readArray();
		printArray(s);	
	}


	public static String[] readArray()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Length of String");
	int length= sc.nextInt();
	System.out.println("Enter the  characters");
	String[]  s= new String[length];
	for (int i= 0;i < s.length;i++)
	{
	 s[i]=sc.next();
	 }
	 return s;
	 }

	 public static void printArray(String[] s)
	{
		 System.out.println(" The String are ");
			 for (String i : s)
		{
			System.out.println(i);
		}
	}
}


