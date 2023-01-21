package string;
import java.util.Scanner;
public class SpecialFlushCharacters {
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		System.out.println("enter the word: ");
		String word=input.nextLine();

		String result=getValues(word);
		System.out.println("special characters: "+result);

		input.close();
	}
	public static String getValues(String word) 
	{
		StringBuffer sb=new StringBuffer();
		for(int start=0;start<word.length();start++) 
		{
			char letter=word.charAt(start);
			if(!Character.isAlphabetic(letter))
				sb.append(letter);
		}
		return sb.toString();
	}

}
