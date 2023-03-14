// 4. write a java program that uses a scope of variable

class scope_variable
{
	int a = 10;
	void sum()
	{
		int b = 20;
		System.out.println("Local variable of print method :- "+b);
		System.out.println("Global variable :- "+a);
	}
	public static void main(String[] args)
	{
		int i = 90;
		System.out.println("Variable of main method :- "+i);
		scope_variable t = new scope_variable();
		t.print();
	}
}
/*2
class scope_variable
{
int a = 100;
void sum()
{
int b = 20;
int c = a+b;
System.out.println("Sum is :- "+c);
}
void minus()
{
int b = 20;
int c = a-b;
System.out.println("Substaction is :- "+c);
}
void mul()
{
int b = 20;
int c = a*b;
System.out.println("Multiplication is :- "+c);
}
void divide()
{
int b = 20;
int c = a/b;
System.out.println("Division is :- "+c);
}
void modulo()
{
int b = 20;
int c = a%b;
System.out.println("modulo Division is :- "+c);
}
public static void main(String[] args)
{
int i = 90;

System.out.println("Variable of main method :- "+i);
scope_variable t = new scope_variable();
System.out.println("Global variable from class into main method:- "+t.a);
//i = i+t.a;
//System.out.println("Sum :- "+i);
t.sum();
t.minus();
t.mul();
t.divide();
t.modulo();
}
}
*/
