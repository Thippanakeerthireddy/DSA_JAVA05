public class Recursionwgr
{
    
public void fun(int n)
    
{
        
if(n==11) return;
       
 System.out.println(n);
        
fun(n+1);
        
System.out.println(n);
   
 }
	
public static void main(String[] args)
 {
		
Recursionwgr m=new Recursionwgr();
		
m.fun(1);
	
}

}