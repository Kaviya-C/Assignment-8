package string;
import java.util.Scanner;
import java.util.StringTokenizer;
public class NameShrinkling {
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		System.out.println("enter the string: ");
		String sentences=input.nextLine();
		getValues(sentences);
		input.close();
	}
	public static void getValues(String sentences) {
		StringBuffer sb=new StringBuffer();
		StringTokenizer st=new StringTokenizer(sentences," ");
		String s2=st.nextToken();
		String s3=st.nextToken();
		String s4= st.nextToken();
		sb.append(s4).append(" ");
		sb.append(s3.substring(0,1));
		sb.append(".");
		sb.append(s2.substring(0,1));
		System.out.println(sb);

	}

}
