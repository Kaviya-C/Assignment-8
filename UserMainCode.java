package string.occurencecount;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;
public class UserMainCode 
{
	public static int empdis(String s,String f) 
	{
		ArrayList<String> r=new ArrayList<String>();
		int n;
		StringTokenizer st=new StringTokenizer(s," ");
		while(st.hasMoreTokens()) 
		{
			r.add(st.nextToken());
		}
		n=Collections.frequency(r, f);
		return n;
	}
}	
