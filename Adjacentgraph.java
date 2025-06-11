class graph
{
    int var;
    int [][] arr;
    graph(int size)
    {
        this.var=size;
        arr=new int [var][var];
    }
    void add(int x,int y)
    {
        arr[x][y]=1;
        arr[y][x]=1;
    }
    void print()
    {
        for(int i=0;i<var;i++)
        {
            for(int j=0;j<var;j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
public class Adjacentgraph
    {
        public static void main(String[] args)
        {
            graph g=new graph(4);
            g.add(0,1);
            g.add(0,2);
            g.add(1,2);
            g.add(2,3);
            g.print();
        }
    }
