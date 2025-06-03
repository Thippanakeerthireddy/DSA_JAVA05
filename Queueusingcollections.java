import java.util.*;
public class Queueusingcollections{
public static void main (String[] args) {
    Queue <Integer> q=new LinkedList<>();
    q.add(1);
    q.add(2);
    System.out.print(q);
    System.out.print(q.remove());
    System.out.print(q);
}
}