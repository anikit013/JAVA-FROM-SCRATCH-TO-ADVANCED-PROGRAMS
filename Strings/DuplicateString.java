//Program to print the duplicate char in a string 
class DuplicateString  
{
	public static void main(String[] args) 
	{
		String s="Programming";
		char[] str=s.toCharArray();
		for(char ss:str)
		{
			System.out.print(ss+" ");
		}
		System.out.println();
		System.out.println("The unique elements in String  are");
		uniqueOcc(str);
		


	}
	public static void uniqueOcc(char[] str)
	{
		for(int i =0; i<str.length; i++)
		{
			int count=1;
			if(str[i] !='/')
			{
				for(int j =i+1 ; j<str.length ; j++)
				{
					if(str[j] !='/')
					{
						if(str[i]==str[j])
						{
							count++;
							str[j]='/';
						}
					}
				}
				
				if(count!=1)
				{
					System.out.print(str[i]+" ");   
				}
				
			}
		}
	}
}
