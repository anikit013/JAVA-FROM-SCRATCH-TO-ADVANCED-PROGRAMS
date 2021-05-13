// To print perfect number from 1 to 1000
//import java.util.*;  --> NO need but still keeping it/ Ignore it 
class PerfectNumber  
{
	public static void main(String[] args) 
	{
		//Scanner.sc= new Scanner(System.in); //--> just in case user want to enter manually, to take input
		// int num= sc.nextInt(); --> to store the input value
		
		System.out.println(" To Display all the perfect Numbers from 1 to 1000");
		
		 int sum=0;
		 for (int i=1; i<=1000 ;i++ )
			 {
			 for (int j=1;j>i ;j++)
			 {
			 if (i%j==0)
			     {
					 sum=sum+j;
				 }

			 }
			 if (sum==i)
				 System.out.print(sum + i);
}
	}
}