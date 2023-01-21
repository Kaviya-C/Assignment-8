package string;
import java.util.Scanner;
public class FetchMiddleCharacter {
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		System.out.println("enter the word having even digits ended...like helloo etc! : ");
		String word=input.nextLine();//this

		String result=UserMainCode.getMiddleCharacter(word);//this
		System.out.println(result);

		input.close();
	}
}
class UserMainCode
{
	public static String getMiddleCharacter(String str) //this
	{
		StringBuffer stringBuff=new StringBuffer();
		if(str.length()%2==0) //4%2==0
		{
			stringBuff.append(str.substring(str.length()/2-1,(str.length()/2)+1));
			//4/2 ---> 2-1=1  ,4/2=2+1 ---->3
			//1,3-------> 1,2---------this t=0  h=1  i=2 s=3-------1,2  h,i
		}
		return stringBuff.toString();			
	}
}

