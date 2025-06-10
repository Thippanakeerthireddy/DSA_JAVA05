import java.util.*;

public class Linearsearch

{
	
public static void main(String[] args) 
{
	
int [] a=new int[5];
	
Scanner sc=new Scanner(System.in);
	
for(int i=0;i<a.length;i++)
	
{
	    
a[i]=sc.nextInt();
	
}
	
int s=sc.nextInt();
	
for(int i=0;i<a.length;i++)
	
{
	   
 if(a[i]==5)
	    
{
	       
 System.out.println(i);
	       
 System.exit(0);
	  
}
	
}
	
System.out.println("not found");
	
}

}