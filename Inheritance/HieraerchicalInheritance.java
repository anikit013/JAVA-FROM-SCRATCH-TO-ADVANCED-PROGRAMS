class  HieraerchicalInheritance
{
	public static void main(String[] args) 
	{
		A a=new A();
		B b=new B();
		C c=new C();

		System.out.println("A.a="+a.x);
		a.print();

		System.out.println("B.b="+b.x);
		System.out.println("B.b="+b.y);
		b.disp();

		System.out.println("C.c="+c.x);
		System.out.println("C.c="+c.z);
		c.view();
	}
}
class A
{
	int x=10;
	public void print()
	{
		System.out.println(" Super class");
	}
}
class B extends A
{
	double y=12.21;
	public void disp()
	{
		System.out.println(" 1st SubClass");
	}
}
class C extends A
{
	long z=23436;
	public void view()
	{
		System.out.println(" 2nd Sub Class");
	}
}
