package string;
import java.util.Scanner;
import java.util.StringTokenizer;
public class StringStartCase 
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		System.out.println("enter the sentences: ");
		String sentence=input.nextLine();
		System.out.println(capitalStart(sentence));
		input.close();
	}
	public static String capitalStart(String s1)
	{
		StringBuffer sb=new StringBuffer();
		StringTokenizer st=new StringTokenizer(s1," ");
		while(st.hasMoreTokens()) 
		{
			String s2=st.nextToken();
			String s3=s2.substring(0,1);
			String s4=s2.substring(1,s2.length());

			sb.append(s3.toUpperCase()).append(s4).append(" ");
		}
			return sb.toString();
		}
	}


