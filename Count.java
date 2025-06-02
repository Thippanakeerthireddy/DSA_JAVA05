import java.util.*;
public class Count
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int count=0;
	    while(n!=0){
	         int rem=n%10;
	        count+=1;
	        n=n/10;
	    }
	      System.out.println(count);
	}
}