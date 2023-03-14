class gcd_lcm
{
public static void main(String[] args)
{
Scanner obj = new Scanner(System.in);
System.out.print("Enter the first no : ");
int a = obj.nextInt();
System.out.print("Enter the second no : ");
int b = obj.nextInt();
int atemp = a;
int btemp = b;
while(btemp!=0)
{
int t = btemp;
btemp = atemp%btemp;
atemp = t;
}
int gcd = atemp;
int lcm = (a*b)/gcd;
System.out.println("GCD of "+a+" and "+b+" is : "+gcd);
System.out.println("LCM of "+a+" and "+b+" is : "+lcm);

}
}
