class s2
{
	s2(int a)
	{
		System.out.println("s2 is created");
	}
}
class t2 extends s2
{
	t2(int a,int b)
	{
		super(20);
		System.out.println("t2 is created");
	}
}
class u2 extends t2
{
	u2(int a,int b,int c)
	{
		super(30,20);
		System.out.println("u2 is created");
	}
}

class tut5_2
{
	public static void main(String[] args)
	{
		u2 obj = new u2(30,40,50);
	}
}