// 3. Write a java program that uses narrowing conversion.
class narrowing_convension
{
	public static void main(String[] args)
	{
		System.out.println();
		System.out.println("Narrowing Convension");
		double d = 100.89;
		long l = (long)d;
		int i = (int)l;
		System.out.println("Double value = "+d);
		System.out.println("Long value = "+l);
		System.out.println("Integer value = "+i);


		System.out.println();
		System.out.println("Widnning Convension");
		long lo = 100;
		float flo = lo;
		System.out.println("Long value = "+lo);
		System.out.println("Float value = "+flo);
	}
} 
