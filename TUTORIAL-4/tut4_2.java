// 2 . write a java application that implements the concept of method overriding

class sample1
{
	public void set(int a)
	{
		System.out.println("set of sample1");
	}
}
class sample2 extends sample1
{
	public void set(int a)
	{
		System.out.println("set of sample2");
	}
}
class tut4_2
{
	public static void main(String[] args)
	{
		sample2 ob = new sample2();
		ob.set(20);
	}
}