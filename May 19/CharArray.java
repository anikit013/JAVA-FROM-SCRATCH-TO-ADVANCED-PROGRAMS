import java.util.*;
class CharArray
{
	public static void main(String[] args) 
	{
		char[] c=readArray();
		printArray(c);	
	}


	public static char[] readArray()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Length of  character");
	int length= sc.nextInt();
	System.out.println("Enter the  characters");
	char[]  c= new char[length];
	for (int i=0;i < c.length;i++)
	{
	 c[i]=sc.next().charAt(0);
	 }
	 return c;
	 }

	 public static void printArray(char[] c)
	{
		 System.out.println(" The characters are ");
			 for (char i : c)
		{
			System.out.println(i);
		}
	}
}


