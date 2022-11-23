package linkedList;

public class LinkedList {
	static Node head;// head of Linked_list.
	public void addData(int data) {
		
		//Node With data created.
		Node firstNode = new Node(70);
		
		//Add elements to the linked list at first position.
		Node newNode = new Node(data);
		firstNode = head;
		newNode.next = firstNode;
		head = newNode;
		
		Node temp = head;
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
		
	}

	public static void main(String[] args) {

		LinkedList linkedList = new LinkedList();
		System.out.println("Welcome to Data Structures");
		linkedList.addData(70);
		linkedList.addData(30);
		linkedList.addData(56);
	}
}
