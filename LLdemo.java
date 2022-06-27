package linkedlists;

public class LLdemo {

	public static void main(String[] args) {
		Linkedlist l=new Linkedlist();
		l.insertAtHead(50);
		l.insertAtHead(10);
		l.insertAtHead(2);
		
		l.insertAtHead(2);
		l.insertAtHead(12);
		l.insertAtHead(19);
		l.insertAtHead(20);
		System.out.println(l);
		System.out.println(l.findLength());
		l.deleteFromHead();
		System.out.println(l);
		System.out.println("Found: "+l.find(10));
		
		System.out.println(l);

	}

}
