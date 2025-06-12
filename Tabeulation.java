public class Tabeulation   
{
    public static void main(String[] args)
    {
        int n=50;
        int[] memo=new int[n+1];
        memo[1]=1;
        for(int i=2;i<memo.length;i++)
        {
            memo[i]=memo[i-1]+memo[i-2];
        }
        System.out.println(memo[n]);
    }
}