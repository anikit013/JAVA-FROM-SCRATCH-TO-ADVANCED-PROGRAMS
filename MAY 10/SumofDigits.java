// Program to determine sum of digits
import java.util.Scanner;
class SumofDigits
{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter a number ");
		int num= sc.nextInt();
		int number= SumDigitlogic(num);
		System.out.println(" The Sum is " +  number);
		}
		public static int SumDigitlogic(int num) {
			int sum=0;
			int rem=0;
			/*while (num>0)
			{ rem=num%10;
			sum=sum+rem;
			num=num/ 10;
			}
			return sum;
		}
}
*/
		for (int i=0; i<num ; i++)
		{
			rem=num%10;
			sum=sum+rem;
			num=num/ 10;
		}
		return sum;
		}
}