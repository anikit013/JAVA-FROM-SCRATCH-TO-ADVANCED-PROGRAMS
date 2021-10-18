class Demo
{
	public static final int x=10;
	static
	{
		int  x=20;
	}
}
class Program 
{
	public static void main(String[] args) 
	{
		System.out.println(Demo.x);
	}
}
