class Demo 
{
	public int x,y;
	Demo(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
}

	class Test
{
	public void modify(Demo d) 
	{
		System.out.println(d.x);
		System.out.println(d.y);
		d.x=100;
		d.y=200;
	}
}
 
 class MainClass
 {
	 public static void main(String[] args)
	 {
		 Demo d=new Demo(10,20);
		 System.out.println(d.x);
		 System.out.println(d.y);
		 new Test().modify(d);
		 System.out.println(d.x);
		 System.out.println(d.y);
	 }
 }