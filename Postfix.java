import java.util.*;
public class Postfix{
public static void main (String[] args) {
    Stack <Integer> st=new Stack<>();
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    for(int i=0;i<s.length();i++)
    {
        char ch=s.charAt(i);
        if(Character.isDigit(ch))
        {
            st.push(Character.getNumericValue(ch));
        }
        else
        {
            int a=st.pop();
            int b=st.pop();
            if(ch=='+') st.push(a+b);
            if(ch=='-') st.push(a-b);
            if(ch=='*') st.push(a*b);
            if(ch=='/') st.push(a/b);
        }
    }
    System.out.println(st.pop());
}
}