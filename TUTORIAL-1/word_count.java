// 9. Write a java program to count numbers of worlds from the given string
import java.util.*;
class world_count
{
public static void main(String[] args)
{
Scanner obj = new Scanner(System.in);
System.out.print("Enter the string : ");
String a = obj.nextLine();
int count=1;
for(int i=0;i<a.length();i++)
{
if((a.charAt(i)) ==' ' && (a.charAt(i+1)!=' '))
{
count++;
}
}
System.out.println("Total worlds in string : "+count);
}
}
