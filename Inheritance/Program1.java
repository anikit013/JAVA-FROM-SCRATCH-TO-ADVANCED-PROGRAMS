class A
	{
		int x=10;
		public void print()
		{
			System.out.println(" This is a parent class");
		}
	}
class B extends A

	{
		double y=12.21;
		public void  print(int n)
		{
			System.out.println("This is a sub class");
		}
	}
class C extends B
	{
		char z='a';
		public void disp()
		{
			System.out.println(" This is subclass of C");
		}
	}

	class Program1 
{
	public static void main(String[] args) 
	{
		A a =new A();
		B b=new B();
		C c=new C();

		System.out.println("A.a="+a.x);
		a.print();
		System.out.println("B.b="+b.x);
		System.out.println("B.b="+b.y);
		b.print(100);
		System.out.println("C.c="+c.x);
		System.out.println("C.c="+c.y);
		System.out.println("C.c="+c.z);
		c.disp();
	}
}