class w
{
	float a = 20.54f;
}
class x extends w
{
	String s = "Hello";
}
class y extends x
{
	int i = 20;
	void printdata()
	{
		System.out.println("Float value : "+a);
		System.out.println("String value : "+s);
		System.out.println("Integer value : "+i);
	}
}
class tut5_1
{
	public static void main(String[] args)
	{
		y obj = new y();
		obj.printdata();
	}
}