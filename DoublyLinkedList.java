package linkedlists;

public class DoublyLinkedList {
	private DLLnode head;
	public void insertAtHead(int data) {
		DLLnode n = new DLLnode(data);
		n.setNextNode(this.head);
		if(head!=null) {
			this.head.setPrevNode(n);
		}
		this.head=n;
	}
	public int len() {
		int l=0;
		if (head==null) {
			return l;
		}
		DLLnode n=this.head;
		while(n!=null) {
			l++;
			n=n.getNextNode();
			}
		return l;
		
	}
	@Override
	public String toString() {
		StringBuffer sb=new StringBuffer();
		DLLnode n=this.head;
		while(n!=null) {
			sb.append("Node: ");
			sb.append(n.getData());
			sb.append("\n");
			n=n.getNextNode();
		}
		return sb.toString();	}

}
