import java.util.*;
public class Removewhitespaces
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String a=sc.nextLine();
	    String b="";
	    for(int i=0;i<a.length();i++)
	    {
	        char ch=a.charAt(i);
	        if (ch!=' ')
	        {
	            b=b+a.charAt(i);
	        }
	    }
	        System.out.println(b);
	}
}

