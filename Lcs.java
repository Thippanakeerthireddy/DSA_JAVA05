public class Lcs
    {
        public static void main (String[] args)
    {
        String s="abcde";
        String s1="ace" ;
        int m=s.length();
        int n=s1.length();
        int[][] arr=new int[m+1][n+1];
        for(int i=m-1;i>=0;i--)
        {
            for(int j=n-1;j>=0;j--)
            {
                if(s.charAt(i)==s1.charAt(j))
                {
                    arr[i][j]=1+arr[i+1][j+1];
                }
                else
                {
                    arr[i][j]=Math.max(arr[i][j+1],arr[i+1][j]);    
                }
            }
        }
        System.out.println(arr[0][0]);
    }
}