public class Recursion   

{
   
 public void fun(int n)
   
 {
        
if(n==11) return;
       
 System.out.println(n);
       
 fun(n+1);
    
}
	
public static void main(String[] args) 
{
		
Recursion m=new Recursion();
		
m.fun(1);
	
}

}