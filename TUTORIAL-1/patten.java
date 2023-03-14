class patten
{
    public static void main(String[] args)
    {
		int i,j;
             System.out.println();
		System.out.println("First Patten");
		for(i=0;i<=3;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print("*");
			}
		System.out.println();
		}

		System.out.println();
		System.out.println("Second Patten");
             int k=1;
		for(i=1;i<=4;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(k++);
			}
		System.out.println();
		}	

	   System.out.println();
	   System.out.println("Third Patten");
         for(i=1;i<=8;i++)
	  {
		for(j=8;j>i;j--)
		{
			System.out.print("  ");
		}
              for(j=1;j<=i;j++)
    		{
			System.out.print("* ");
		}
		System.out.println();
	  }

	System.out.println();
       System.out.println("Fourth patten :- ");
       int a = 0;
	int b = 1;
	for(i=0;i<=3;i++)
	{
		for(j=0;j<=i;j++)
		{
		      System.out.print(" "+a);
			System.out.print(" "+b);
			int temp;
			temp = a+b;
			a = temp;
                   b = a + temp;
		}
 	System.out.println();
	}
    }
}