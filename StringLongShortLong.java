package string;
import java.util.Scanner;
public class StringLongShortLong {
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		System.out.println("enter the word: ");//Hello
		String letter=input.next();	
		System.out.println("enter the word: ");//Hi
		String letter1=input.next();
		System.out.println(capitalStart(letter,letter1));//---line no---16
		input.close();
	}
	public static String capitalStart(String word1,String word2) //Hello  Hi
	{
		StringBuffer sb=new StringBuffer();//
		int word1Len=word1.length();//5
		int word2Len=word2.length();//2
		if(word1Len>word2Len)//5>2
		{
			sb.append(word1).append(word2).append(word1);//HelloHiHello
		}
		else// Hi>Hello----
		{
			sb.append(word2).append(word1).append(word2);//
		}
		return sb.toString();
	}
}
