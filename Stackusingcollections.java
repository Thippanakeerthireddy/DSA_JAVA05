import java.util.Stack;
public class Stackusingcollections{
public static void main (String[] args) {
    Stack s=new Stack<>();
    s.push(1);
    s.push(2);
    System.out.print(s.pop());
    System.out.print(s.peek());
    System.out.print(s);
}
}