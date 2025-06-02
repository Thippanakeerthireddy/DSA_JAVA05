import java.util.*;
import java.lang.*;
public class ArmstrongNumber
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    double sum=0;
	    int m=n;
	    int l=n;
	    int count=0;
	    while(n!=0){
	        int rem=n%10;
	        count+=1;
	        n=n/10;
	    }
	    while(m!=0){
	        int rem=m%10;
	        sum=sum+Math.pow(rem,count);
	        m=m/10;
	    }
	    if(l==sum){
	    System.out.println("Armstrong");
	    }
	    else{
	        System.out.println("not Armstrong");
	    }
  }
}