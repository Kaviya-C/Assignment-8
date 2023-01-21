package string.occurencecount;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Main {
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		String s1=input.nextLine();
		String s3=input.next();
		int count=0;
		StringTokenizer st=new StringTokenizer(s1," ");
		while(st.hasMoreElements()) 
		{
			String s2=st.nextToken();
			if(s2.equals(s3)) 
				count++;
		}
		System.out.println(count);
		
		input.close();
	}
}

