import java.util.*;
public class Comparingtwostrings
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String a=sc.nextLine();
	    String b=sc.nextLine();
	    {
	        if(a.length()!=b.length())
	        {
	            System.out.println(false);
	            System.exit(0);
	        }
	    for(int i=0;i<a.length();i++)
	    {
	        if(a.charAt(i)!=b.charAt(i))
	        {
	            System.out.println(false);
	            System.exit(0);
	        }
	    }
	    }
	    System.out.println(true);
	}
}

