public class Memoization  
{
    static int c=0;
    public static int fib(int n,int[] memo)
    {
        if(memo[n]!=-1) return memo[n];
        c++;
        if(n<=1) return n;
        memo[n]=fib(n-1,memo)+fib(n-2,memo);
        return memo[n];
    }
    public static void main(String[] args)
    {
        int n=50;
        int[] memo=new int[n+1];
        for(int i=0;i<memo.length;i++)
        {
            memo[i]=-1;
        }
        System.out.println(fib(n,memo));
        System.out.println(c);
    }
}
        