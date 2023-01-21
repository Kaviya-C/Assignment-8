package string.occurencecount;
import java.util.Scanner;
public class SubMain {
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("enter the string: ");//hello world this is kavi! how was the day??kavi hope ur doing well
		String s=input.nextLine();
		System.out.println("enter the word you want: ");//kavi
		String f=input.next();

		System.out.println(UserMainCode.empdis(s,f));
		input.close();
	}
}
//Hai this is kaviya here!is this you?