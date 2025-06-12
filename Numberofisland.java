public class Numberofisland   
{
    public static void fun(int[][] a,int i,int j)
    {
        if((i<0) || (i>=a.length) || (j<0) || (j>=a[0].length) || (a[i][j]==0))
        return ;
        a[i][j]=0;
        fun(a,i-1,j);
        fun(a,i+1,j);
        fun(a,i,j-1);
        fun(a,i,j+1);
    }
    public static void main(String[] args)
    {
        int[][] a={{1,0,0,1},
                   {0,0,0,1},
                   {0,1,0,0},
                   {0,1,0,1}};
        int c=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
            {
                if(a[i][j]==1)
                {
                    c++;
                    fun(a,i,j);
                }
            }
        }
        System.out.println("no of island" + c);
    }
}