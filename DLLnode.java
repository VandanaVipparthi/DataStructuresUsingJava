package linkedlists;

public class DLLnode {
	private int data;
	private DLLnode prevNode;
	private DLLnode nextNode;
	
	public DLLnode(int data) {
		this.data=data;
	}
	//setters
	public void setData(int data) {
		this.data=data;
	}
	public void setPrevNode(DLLnode prevNode) {
		this.prevNode=prevNode;
	}
	public void setNextNode(DLLnode nextNode) {
		this.nextNode=nextNode;
	}
	//getters
	public int getData() {
		return data;
	}
	public DLLnode getPrevNode() {
		return prevNode;
	}
	public DLLnode getNextNode() {
		return nextNode;
	}
	@Override
	public String toString() {
		return "Data: "+ this.data;
	}

}
