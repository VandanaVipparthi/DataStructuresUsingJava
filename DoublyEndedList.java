package linkedlists;

public class DoublyEndedList {
	private Node head;
	private Node tail;
	public void insertAtTail(int data) {
		Node n= new Node(data);
		if (this.head==null) {
			this.head=n;
		}
		if(this.tail!=null) 
			this.tail.setNextNode(n);
		this.tail=n;
		
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
