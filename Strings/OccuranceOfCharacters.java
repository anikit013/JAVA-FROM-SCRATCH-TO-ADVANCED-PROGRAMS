//Program to count number of occurance in a given string
class OccuranceOfCharacters 
{
	public static void main(String[] args) 
	{
		String s = "Hello";
		char[] ch=s.toCharArray();
	    occurance(ch);
	}
	public static void occurance(char[] ch)
	{
		for(int i=0 ; i<ch.length ; i++)
		{
			int count=1;
			if(ch [i] != '/')
			{
				for(int j=i+1; j<ch.length ;j++)
				{
					if(ch[j]!='/')
					{
						if(ch[i]==ch[j])
						{
							count=count+1;
							ch[j]='/';
						}
					}
				}
				System.out.println(ch[i] +" occurs " + count + " times");
			}
		}
	}
}
