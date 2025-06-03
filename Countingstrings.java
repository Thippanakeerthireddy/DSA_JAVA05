import java.util.*;
public class  Countingstrings
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String a=sc.nextLine();
	    int count=0;
	    char b=sc.next().charAt(0);
	    for(int i=0;i<a.length();i++)
	    {
	        char ch=a.charAt(i);
	        if(ch==b)
	        {
	            count+=1;
	        }
	    }
		System.out.print(count);
	}
}
