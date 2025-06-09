public class Rwr
{
    
public void fun(int n)
    
{
        
if(n==11) return;
        
fun(n+1);
        
System.out.println(n);
    
}
	
public static void main(String[] args) 
{
		
Rwr m=new Rwr();
		
m.fun(1);
	
}

}