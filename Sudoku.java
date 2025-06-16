public class Sudoku
{
	public static void main(String[] args) {
		int [][] arr={
            {3, 0, 6, 5, 0, 8, 4, 0, 0},
            {5, 2, 0, 0, 0, 0, 0, 0, 0},
            {0, 8, 7, 0, 0, 0, 0, 3, 1},
            {0, 0, 3, 0, 1, 0, 0, 8, 0},
            {9, 0, 0, 8, 6, 3, 0, 0, 5},
            {0, 5, 0, 0, 9, 0, 6, 0, 0},
            {1, 3, 0, 0, 0, 0, 2, 5, 0},
            {0, 0, 0, 0, 0, 0, 0, 7, 4},
            {0, 0, 5, 2, 0, 6, 3, 0, 0}};
            if(solve(arr))
            {
                print(arr);
            }
            else
            {
                System.out.println("not possible");
                
            }
	}
	static void print(int [][] arr)
	{
	    for(int i=0;i<arr.length;i++)
	    {
	        for(int j=0;j<arr[0].length;j++)
	        {
	            System.out.print(arr[i][j] + " ");
	        }
	        System.out.println();
	    }
	}
	static boolean solve(int [][] arr)
	{
	    for(int i=0;i<arr.length;i++)
	    {
	        for(int j=0;j<arr[0].length;j++)
	        {
	            if(arr[i][j]==0)
	            {
	                for(int k=1;k<10;k++)
	                {
	                    if(safe(arr,i,j,k))
	                    {
	                        arr[i][j]=k;
	                        if(solve(arr))
	                        {
	                            return true;
	                        }
	                        arr[i][j]=0;
	                    }
	                }
	                return false;
	            }
	        }
	    }
	    return true;
	}
	static boolean safe(int [][] arr,int r,int c,int k)
	{
	    for(int i=0;i<arr.length;i++)
	    {
	        if(arr[i][c]==k) return false;
	    }
	    for(int i=1;i<arr.length;i++)
	    {
	        if(arr[r][i]==k) return false;
	    }
	    int row=r-(r%3);
	    int col=c-(c%3);
	    for(int q=row;q<row+3;q++)
	    {
	        for(int a=col;a<col+3;a++)
	        {
	            if(arr[q][a]==k) return false;
	        }
	    }
	    return true;
	}
} 