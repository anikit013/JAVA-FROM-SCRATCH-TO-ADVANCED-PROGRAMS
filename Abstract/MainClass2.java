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
	class Sample
	{
		public static Test getObject()
		{
			return new Test();
		}
	
	}

	class MainClass2
	{
		public static void main(String[] args)
		{
		Sample.getObject().getInstance().print();
		}
	}