public class Maze 
{
    public static boolean fun(int[][] a,int i,int j)
    {
        if((i<0) || (i>=a.length) || (j<0) || (j>=a[0].length) || (a[i][j]==0))
        return false;
        if(a[i][j]==9) return true;
        a[i][j]=0;
        return fun(a,i-1,j) || fun(a,i+1,j) || fun(a,i,j-1) || fun(a,i,j+1);
    }
    public static void main(String[] args)
    {
        int[][] a={{8,1,1,1},
                   {0,0,0,1},
                   {0,1,0,0},
                   {0,1,0,9}};
    for(int i=0;i<a.length;i++)
    {
        for(int j=0;i<a[0].length;j++)
        {
            if(a[i][j]==8)
            {
                if(fun(a,i,j)==true)  System.out.println("way found");
                else
                {
                    System.out.println("no way found");
                }
            }
        }
    }
    }
}
        