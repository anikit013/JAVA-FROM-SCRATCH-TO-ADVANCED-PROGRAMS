//Program of prices and discount
import java.util.Scanner;
class Interview_Question
{
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String[] str=s.split(" ");
		for(String ss:str)
		{
			int num=Integer.parseInt(ss);
			discount(num);
		}
	}
	public static void discount(int num)
	{
		int discount;
		if(num<=1000)
		{
			System.out.print(num+" ");
		}
		else if(num > 1000 && num <1500)
		{
			discount=(num/100) * 10;
			System.out.print(discount+" ");
		}
		else if(num >= 1500)
		{
			discount=(num/100) * 20 ;
			System.out.print(discount+" ");
		}
	}


}