package string;

import java.util.StringTokenizer;

import java.util.Scanner;
public class NegativeString {
	public static void main(String[] args) 
	{
		Scanner input =new Scanner(System.in);
		System.out.println("enter the string : ");
		String word=input.nextLine();
		String result=validateNegative(word);
		System.out.println(result);
		
		input.close();
	}
	public static String validateNegative(String word) {
		StringTokenizer st=new StringTokenizer(word," ");

		StringBuffer sb=new StringBuffer();
		while(st.hasMoreTokens())
		{
			String result=st.nextToken();
			if(result.equals("is"))
			{
				sb.append(result.replace("is", " is not "));
			}
			else
				sb.append(result);
			sb.append(" "); 
		}
		return sb.toString();

		
	}

}
