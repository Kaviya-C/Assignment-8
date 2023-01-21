package string;
import java.util.Scanner;
public class NthCharacter {
	public static void main(String[] args) 
	{
		try(Scanner input=new Scanner(System.in))
		{
			int size=input.nextInt();
			String [] string=new String[size];
			for(int index=0;index <size;index++)
			{
				string[index]=input.next();
			}
			int position=input.nextInt();
			StringBuilder builder=new StringBuilder();
			for(String result:string) 
			{
				builder.append(UserMainCodeLastDollar.formString(result,position));
			}
			System.out.println(builder.toString());
		}
	}
}

/*	StringBuilder last=new StringBuilder();
		System.out.println("enter the count of string: ");
		int count=input.nextInt();
		String letter1=null;
		while(count!=0)
		{
			System.out.print("enter the letter: ");
			letter1=input.next();
			count--;	
			letter1.toCharArray();
			System.out.println("enter which index character you want: ");
			int index=input.nextInt();
			for(int start=index;start<=letter1.length()-1;start++)
			{
					last.append(letter1.charAt(index));	
			}
		}

		System.out.println(last);
		input.close();
	}
}*/

//if(!letter1.lastIndexOf(letter1[start]))
//found=1;
