// 1 . write a java application that implements the concept of method overloading

class sample
{
	public void set()
	{
		System.out.println("Method of 0 args");
	}
	public void set(int a)
	{
		System.out.println("Method of 1 args");
	}
	public void set(int a,float b)
	{
		System.out.println("Method of 2 args");
	}
}
class tut4_1
{
	public static void main(String[] args)
	{
		sample ob = new sample();
		ob.set();
		ob.set(20);
		ob.set(30,30.4f);
	}
}