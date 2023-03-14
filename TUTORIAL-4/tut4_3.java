// 3 . Create a java application to count factorial of a number entered through command line arguments.


class tut4_3
{
	public static void main(String[] args)
	{
		int fact=1;
		int comm = Integer.parseInt(args[0]);
		for(int i=1;i<=comm;i++)
		{
			fact = fact*i;
		}
		System.out.print("Factorial of "+args[0]+" is : "+fact);
	}
}