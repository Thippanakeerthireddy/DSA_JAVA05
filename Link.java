class Node
{
  int data;
  Node next;
  Node(int n)
  {
      this.data=n;
      this.next=null;
  }
}

public class Link
{
	public static void main(String[] args) {
		Node a=new Node(1);
		Node b=new Node(2);
		Node c=new Node(3);
		a.next=b;
		b.next=c;
		System.out.println(a.data);
		System.out.println(a.next.data);
		System.out.println(a.next.next.data);
	}
}