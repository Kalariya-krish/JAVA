import java.util.*;
abstract class shape
{
	abstract void area();
}
class circle extends shape
{
	public void area()
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the radious : ");
		float r = s.nextFloat();
		float area = (r*r*3.14f);
		System.out.println("Area of circle is : "+area);
	}
}
class ractangle extends shape
{
	public void area()
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the length : ");
		float l = s.nextFloat();
		System.out.print("Enter the width : ");
		float w = s.nextFloat();
		float area = (l*w);
		System.out.println("Area of ractangle is : "+area);
	}
}

class tut5_4
{
	public static void main(String[] rags)
	{
		circle ci = new circle();
		ractangle ra = new ractangle(); 
		ci.area();
		ra.area();
	}
}

