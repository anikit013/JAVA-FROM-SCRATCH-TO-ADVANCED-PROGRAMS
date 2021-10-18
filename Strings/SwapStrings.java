//Program to swap the words of a given string
class SwapStrings   
{
	public static void main(String[] args) 
	{
		String s="Welcome to java class";
		System.out.println(s);
		swapWords(s);
	}
	public static String[] breakstr(String s)
	{
		String[] str=new String[getSpaceCount(s) +1];
		String temp="";
		int j=0;
		for(int i =0 ; i<s.length(); i++)
		{
			if(s.charAt(i) != ' ')
			{
				temp=temp+s.charAt(i);
			}
			else
			{
				str[j]=temp;
				j++;
				temp="";
			}
		}

		str[j]=temp;
		return str;
	}
	public static int getSpaceCount(String s)
	{
		int count=0,i=0;
		while(i<s.length())
		{
			if(s.charAt(i) == ' ')
			{
				count++;
			}
			i++;
		}
		return count;
	}
	public static void swapWords(String s)
	{
		String[] str=breakstr(s);
		for(int i =0 ; i <str.length/2 ; i++)
		{
			String temp=str[i];
			str[i]=str[str.length-1-i];
			str[str.length-1-i]=temp;
		}
		for(String ss:str)
		{
			System.out.print(ss+" ");
		}
		System.out.println();
	}

}
