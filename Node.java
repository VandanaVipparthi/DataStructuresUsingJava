package linkedlists;

public class Node {
	private int data;
	private Node nextNode;
	//constructor for the node class
	public Node(int data) {
		this.data=data;
	}
	//as we made variables private to access these we use getters setters
	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNextNode() {
		return nextNode;
	}

	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
	@Override
	public String toString() {
		return "Data: "+ this.data;
	}

}
