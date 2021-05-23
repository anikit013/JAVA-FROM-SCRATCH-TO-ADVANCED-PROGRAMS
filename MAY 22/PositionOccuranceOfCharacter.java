//WAP to check the position Occurance of character
import java.util.*;
class PositionOccuranceOfCharacter
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		char[] a={'a','e','i','o','u'};
		System.out.println(" Enter the Search key ");
		char key= sc.next().charAt(0);
		Occurance(a,key);
	}
		public static void Occurance(char[] a, char key)
	{
		boolean flag=false;
		for (int i=0;i < a.length;i++)
		{
			if (key == a[i])
			{
				System.out.println(" Key is found at position " + (i+1));
				flag = true;
				break;
			}
			}
			if (!flag)
			{
				System.out.println(" Key is not found ");
			}
	}
}
