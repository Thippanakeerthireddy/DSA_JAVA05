import java.util.*;
public class Vowelconsonantcount
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String a=sc.nextLine();
	    int vcount=0;
	    int ccount=0;
	    for(int i=0;i<a.length();i++)
	    {
	        char ch=a.charAt(i);
	        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
	        {
	            vcount+=1;
	        }
	        else{
	            ccount+=1;
	        }
	    }
		
		System.out.println(vcount);
		System.out.println(ccount);
	}
}
