/* 5.Write a java program that check the result of the students 
     whether he is pass of fail using ternary operator  */
	 
class student_marks
{
	public static void main(String[] args)
	{
		int maths = 80;
		int science = 75;
		String p_f = (maths>50 && science>50)?"You are pass":"You are fail";
		System.out.println(p_f);
	}
}