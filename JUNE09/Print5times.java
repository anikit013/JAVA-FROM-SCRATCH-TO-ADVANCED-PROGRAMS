class Print5times
{
	public static void main(String[] args) 
	{
		print(1);
	}
	public static void print(int i)
	{
		if (i<=5)
		{
		
		System.out.println("Hello World!");
		print(i+1);
		}
		
	}
}
