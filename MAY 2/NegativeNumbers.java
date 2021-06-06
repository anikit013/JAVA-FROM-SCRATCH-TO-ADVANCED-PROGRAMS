//Program to print all the negative numbers in a sequence of numbers
import java.util.Scanner;
class NegativeNumbers 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String[] str=s.split(" ");
		for(String ss:str)
		{
			int num=Integer.parseInt(ss);
			negative(num);
		}
	
	}
	public static void negative(int num)
	{
		if(num < 0)
		{
			System.out.print(num+ " ");
		}
	}
}
