import java.util.*;
public class Whitespaces
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String a=sc.nextLine();
	    String b="";
	    for(int i=a.length()-1;i>-1;i--)
	    {
	        b=b+a.charAt(i);
	    }
		System.out.print(b);
	}
}
