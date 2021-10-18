class Demo 
{
	public void print()
	{
		System.out.println("Hello JSP");
	
	}
}
	class Test
	{
		public Demo getInstance()
		{
			return new Demo();
		}
	}
	class MainClass1
	{

	public static void main(String[] args) 
	{
		Test t=new Test();
		Demo d=t.getInstance();
		d.print();

		/* Test T= new Test();
			t.getInstance().print();

			new Test().getInstance().print();
	}
}
