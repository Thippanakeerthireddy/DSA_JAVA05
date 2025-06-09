public class Rf

{
    
public int fun(int n)
    
{
        
if(n==1) 
        
{
        
return 1;
      
 }
        
return n*fun(n-1);
   
 }
	
public static void main(String[] args) 
{
	
Rf m=new Rf();
	
System.out.println(m.fun(5));
	
}

}