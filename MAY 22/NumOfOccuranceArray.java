//WAP to find the number of Occurance
import java.util.*;
class NumOfOccuranceArray
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		
		int[] a={12,54,65,34,45,45};
		
		System.out.println(" Enter the Search key ");
		int key= sc.nextInt();
		int count=0;
		for (int num : a)
		{
			if (Occurance(num,key))
			{
				count++;

			}

		}
		System.out.println(" The total number of occurance is " + count);
	}

	public static boolean Occurance(int num, int key)
	{
		
		boolean flag = false;
		for (int i=0;i<num;i++)
		{
			if (num==key)
			{
				flag=true;
				break;
				
			}
			
		}
		return flag;
	}
}
