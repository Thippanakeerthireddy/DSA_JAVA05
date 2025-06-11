import java.util.*;
public class Adjacentlist
{
    static int var=4;
    static List<Integer> [] g = new ArrayList[var];
    public static void main(String[] args)
    {
        for(int i=0;i<var;i++)
        {
            g[i]=new ArrayList<>();
        }
        addn(0,1);
        addn(0,2);
        addn(1,2);
        addn(2,3);
        print();
    }
    static void addn(int i,int j)
    {
        g[i].add(j);
        g[j].add(i);
    }
    static void print()
    {
        for(int i=0;i<var;i++)
		{
			System.out.print(i +" : ");
            for(int val:g[i])
            {
                System.out.print(val +" ");
            }
            System.out.println();
        }
        }
    }