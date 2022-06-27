package linkedlists;

public class DLLdemo {

	public static void main(String[] args) {
		DoublyLinkedList dll=new DoublyLinkedList();
		dll.insertAtHead(10);
		dll.insertAtHead(110);
		dll.insertAtHead(120);
		dll.insertAtHead(1);
		dll.insertAtHead(101);
		dll.insertAtHead(12);
		System.out.println(dll);
		System.out.println(dll.len());

	}

}
