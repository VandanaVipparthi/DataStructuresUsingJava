package linkedlists;

public class Linkedlist {
	//the only reference you have to a linked list is the head element
	private Node head;
	
	//inserting new node at the head O(1) time because no traversal of nodes is required here
	public void insertAtHead(int data) {
		Node n=new Node(data);
		n.setNextNode(this.head);
		this.head=n;
	}
	// deleting a node at head takes O(1) time
	public void deleteFromHead() {
		this.head=this.head.getNextNode();
		}
	// takes O(n) time
	public int findLength() {
		int count=0;
		Node current=this.head;
		while(current!=null) {
			count++;
			current=current.getNextNode();		
			}
		return count;
	}
	// takes O(n) time
		public Node find(int data) {
			Node current=this.head;
			while(current!=null) {
				if (current.getData()==data) {
					return current;
				}
				current=current.getNextNode();		
				}
			return null;
		}
	@Override
	public String toString() {
		String result="{";
		Node current=this.head;
		while(current!=null) {
			result+=current.toString()+"--->";
			current=current.getNextNode();		
			}
		result+="}";
		return result;
	}
	
	
}
