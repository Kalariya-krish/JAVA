/*  6. write a java program that count th number of days of the mention 
    month in specified year using switch case statement
*/
import java.util.*;

class days_switch_case
{
	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the year :-");
		int y = obj.nextInt();
		System.out.print("Enter the month :-");
		int m = obj.nextInt();
		switch(m)
		{
			case 1:
			    System.out.println("Total days in January :- 31");
				break;
				
			case 2:
				if((y%4==0 && (y%100!=0)) || y%400==0))
				{
					System.out.println("Total days in February :- 29");
				}
				else
					System.out.println("Total days in February :- 28");
				break;
				
			case 3:
			    System.out.println("Total days in March :- 31");
				break;
				
			case 4:
			    System.out.println("Total days in April :- 30");
				break;
			
		    case 5:
			    System.out.println("Total days in May :- 31");
				break;
				
			case 6:
			    System.out.println("Total days in June :- 30");
				break;
				
			case 7:
			    System.out.println("Total days in July :- 31");
				break;
				
			case 8:
			    System.out.println("Total days in Auguast :- 31");
				break;
				
			case 9:
			    System.out.println("Total days in Saptember :- 30");
				break;
			
			case 10:
			    System.out.println("Total days in Octomber :- 31");
				break;
				
			case 11:
			    System.out.println("Total days in November :- 30");
				break;
			
			case 12:
			    System.out.println("Total days in December :- 31");
				break;
				
			default:
				System.out.println("Enter the valid month");
				break;
			
		}
	}
}