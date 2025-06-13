public class Nqueens
    {
        static int n=4;
        public static void main (String[] args)
        {
            int [][] ar=new int[n][n];
            solve(ar,0);
        }
        static void solve(int[][] arr,int r)
        {
            if(r==n)
            {
                print(arr);
                System.out.println();
                return;
            }
            for(int c=0;c<n;c++)
            {
                if(safe(arr,r,c))
                {
                    arr[r][c]=1;
                    solve(arr,r+1);
                    arr[r][c]=0;
                }
            }
        }
        static void print(int [][] arr)
        {
            for(int i=0;i<arr.length;i++)
            {
                for(int j=0;j<arr.length;j++)
                {
                    System.out.print(arr[i][j]+ " ");
                }
                System.out.println();
            }
        }
        static boolean safe(int [][] arr,int r,int c)
        {
            int r1=r;
            int c1=c;
            while(r1>-1)
            {
                if(arr[r1][c1]==1) return false;
                r1-=1;
            }
            int r2=r;
            int c2=c;
            while(r2>-1 && c2>-1)
            {
                if(arr[r2][c2]==1) return false;
                r2-=1;
                c2-=1;
            }
            int r3=r;
            int c3=c;
            while(r3>-1 && c3<arr.length)
            {
                if(arr[r3][c3]==1) return false;
                r3-=1;
                c3+=1;
            }
            return true;
        }
    }
   