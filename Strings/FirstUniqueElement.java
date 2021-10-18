//Print the first non repeated char in agiven string
class FirstUniqueElement 
{
	public static void main(String[] args) 
	{
		String s="spiders";
		char[] ch=s.toCharArray();
		for(char i:ch)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("The first unique elements in array is");
		uniqueOcc(ch);
	}
	public static void uniqueOcc(char[] ch)
	{
		for(int i =0; i<ch.length; i++)
		{
			int count=1;
			if(ch[i] !='/')
			{
				for(int j =i+1 ; j<ch.length ; j++)
				{
					if(ch[j] !='/')
					{
						if(ch[i]==ch[j])
						{
							count++;
							ch[j]='/';
						}
					}
				}
				
				if(count==1)
				{
					
				     System.out.print(ch[i]+" ");
					 return;
				}
			}
		}
	}
}

