package string;
import java.util.Scanner;
public class ReplicationString {
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		System.out.println("enter the word: ");
		String word=input.next();	
		System.out.println("enter the count as you want: ");
		int number=input.nextInt();
		String result=validString(word,number);
		System.out.println(result);
		
		input.close();
		}
	public static String validString(String word,int number) 
	{
		StringBuffer sb=new StringBuffer();
		for(int start=0;start<number;start++) 
		{
			sb.append(word+" ");
		}
		return sb.toString();
		
		
	}


}
