package linkedList;

public class LinkedList {
	Node head;//head of Linked_list.
	// ____________
	//|_head_|null_| initially head 
	
	//Create a Linked List based on 3 nodes
	public static void createLinkedList() {
		
		Node firstNode = new Node(56);//first node.
		Node secondNode = new Node(30);
		Node thirdNode = new Node(70);
		
		//assign head as firstNode.
		//  _________________
		// |___56__|__next___|--->next have the address of next node.
		Node head = firstNode;
		firstNode.next = secondNode;
		secondNode.next = thirdNode;
		
		Node temp = head;
		while(temp != null) {
			System.out.println("\t"+temp.data);
			temp = temp.next;
		}
	}
	
	public static void main(String[] args) {
		
		LinkedList linkedList = new  LinkedList();
		System.out.println("Welcome to Data Structures");
		linkedList.createLinkedList();
	}
}
