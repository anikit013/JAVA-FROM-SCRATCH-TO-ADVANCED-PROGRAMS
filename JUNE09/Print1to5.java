class Print1to5 
{
	public static void main(String[] args) 
	{
		print(1);
	}
	public static void print(int i) 
	{
		if (i<=5)
		{
			System.out.println(i);
			print(i++);
			System.out.println("Idiots");

		}
		System.out.println("Hello Stupid Fellows");
	}
		
}
