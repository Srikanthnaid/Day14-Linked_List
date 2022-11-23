package linkedList;

public class Node {
	public int data;
	public Node next;// next refers to address of next node.
	public Node perivous;

	// Constructor
	// Next is by default initialized as null.
	public Node(int data) {
		this.data = data;
		this.next = null;
		this.perivous = perivous;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + ", next=" + next + "]";
	}

}
