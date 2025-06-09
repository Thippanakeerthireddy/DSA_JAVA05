public class TowerofHanai
{
    
public void fun(String s,String h,String d,int n)
    
{
        
if(n==1) 
        
{
            
System.out.println("move" + n + "from" + s + "to" + d);
            
return ;
        
}
       
 fun(s,h,d,n-1);
       
 System.out.println("move" + n + "from" + s + "to" + d);
       
 fun(h,s,d,n-1);
   
 }
	
public static void main(String[] args) 
{
	
TowerofHanai m=new TowerofHanai();
	
int n=3;
	
m.fun("source","helper","dest",n);
	
}

}