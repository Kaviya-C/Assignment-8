package string;

public class UserMainCodeLastDollar {
	public static String formString(String result,int position) 
	{
		if(result==null||position>result.length()) 
		{
			return "$";
		}
		return String.valueOf(result.charAt(position-1));
	}
}
