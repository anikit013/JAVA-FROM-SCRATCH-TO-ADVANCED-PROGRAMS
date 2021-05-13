// To check the number is perfect or not

import java.util.*;
class PerfectOrNotMethod
    {
	  public static boolean LogicPerfectOrNot(int num) // return boolean value
	   {
		int sum=0;
		int  temp=num;
			for( int i=1; i<num;i++) // checking the condition
			{
				if (num%i==0)
					{
						sum= sum+i;
			}
		
		}	
			return (sum==temp) ? true : false ; // returns boolean value
		}
	
			public static void main(String[] args) 
			{
		
		/*Scanner sc=new Scanner(System.in);  --> For later modification if user want to enter data manually 
		System.out.println(" Enter the number ");
		int num= sc.nextInt();
		*/

				for(int i=1; i<1000;i++) // cause question is as to determine perfect number from 1 to 1000
					{
						if (LogicPerfectOrNot(i)) // checks boolean  reurn value
							{
							System.out.println(  i + "  is a Perfect number ");
							}
					}
			}
}


/* Test cases:-
1
4  5  6

Output:-
6  is a Perfect number
*/

