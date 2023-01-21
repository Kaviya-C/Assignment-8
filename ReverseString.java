package string;
import java.util.Scanner;
public class ReverseString {
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the word: ");//rameshwaram
		String input1=input.nextLine();
		System.out.println("enter the integer: ");//2
		int number=input.nextInt();
		System.out.println("enter the how many letter want:  ");//3
		int letterCount=input.nextInt();
		System.out.println(reverseString(input1,number,letterCount));
		
		input.close();

	}
	public static String reverseString(String input1,int number,int letterCount) 
	{
		StringBuffer string=new StringBuffer(input1);//rajasthan//rameshwaram
		string.reverse();//nahtsajar//matawhsemar
		String output=string.substring(number,number+letterCount);//2---h from this need 3 letter hts//2----taw
		return output;
	}
	

}
