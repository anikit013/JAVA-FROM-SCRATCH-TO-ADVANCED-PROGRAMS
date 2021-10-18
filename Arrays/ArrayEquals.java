//Program to compare two arrays 
import java.util.Arrays;
class ArrayEquals 
{
	public static void main(String[] args) 
	{
	     char[] a={'a','e','i','o','u'};
		 char[] b={'t','a','n','z','i'};

		 if(Arrays.equals(a,b))
		{
			 System.out.println("Arrays are equal");
		}
		else
		{
			System.out.println("Arrays are not equal");
		}
	}
}
