import java.util.Scanner;
class SecondLargestNum
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Length");
		int length=sc.nextInt();

		int[] a=new int[length];
		System.out.println("Enter Array Elements");
		for(int i=0;i<length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println();
		
		secondLargestNum(a);
	}
	public static void secondLargestNum(int[] a)
	{
		int max=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		
		int second=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>second && a[i]!=max)
			{
				second=a[i];
			}
		}
		System.out.print("Second Largest Num= "+second);
	}
	
}