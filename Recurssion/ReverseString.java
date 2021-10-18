//Program to reverse a String
class  ReverseString
{
	public static void main(String[] args) 
	{
		String s="Tanaziya";
		int i=0;
		String rev=reverse(s,s.length()-1);
		System.out.println("The reversed a String " +rev);
	}
	public static String reverse(String s ,int i)
	{
		String rev="";
		if(i>=0)
		{
			return rev+s.charAt(i)+reverse(s,i-1);
		}
		return rev;
	}

}
