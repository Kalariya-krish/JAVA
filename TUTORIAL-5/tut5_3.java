class l1
{
	public void hello()
	{
		System.out.println("Hello method of class l1");
	}
}
class j1 extends l1
{
	public void hello()
	{
		super.hello();
		System.out.println("Hello method of class j1");
	}
}
class k1 extends j1
{
	public void hello()
	{
		super.hello();
		System.out.println("Hello method of class k1");
	}
}

class tut5_3
{
	public static void main(String[] args)
	{
		k1 obj = new k1();
		obj.hello();
	}
}