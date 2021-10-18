import java.util.Scanner;
class Program
{
	public static void main(String[] args) 
	{
		char[] ch=readArray();
		printArray(ch);
		

	}
	public static char[] readArray()
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the length of character array");
		int length= sc.nextInt();

		int[] ch=new int(length);

		for(int i=0 ; i<length ; i++)
		{
			ch[i]=sc.next().charAt(0);
		}

		return ch;
	}
	public static void printArray(char[] c)
	{
		System.out.println("Array elements are:");
		for(char c:ch)
		{
			System.out.println(c);
		}
	}
}

}
