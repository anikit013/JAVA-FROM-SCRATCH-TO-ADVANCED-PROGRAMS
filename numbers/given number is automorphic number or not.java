//Program to check a given number is automorphic number or not
import java.util.Scanner;
class Assg1_6 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check a number is automorphic or not");
		int num=sc.nextInt();
		if(isAutomorphic(num))
		{
			System.out.println(num+" is a automorphic number");
		}
		
	}
	public static boolean isAutomorphic(int num)
	{
       int square = num * num;
       while(num > 0)
	    {
           if(num % 10 != square % 10)
		   {
               return false;
           }
           num = num/ 10;
           square = square/10;
       }
       return true;
       
    }
}
