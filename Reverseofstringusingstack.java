import java.util.*;
public class Reverseofstringusingstack{
public static void main (String[] args) {
    Stack st=new Stack<>();
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    for(int i=0;i<s.length();i++)
    {
        st.push(s.charAt(i));
    }
    String a=" ";
    for(int i=0;i<s.length();i++)
    {
        a=a+st.pop();
    }
    System.out.println(a);
}
}