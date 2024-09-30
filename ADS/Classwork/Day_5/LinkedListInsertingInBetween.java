class LinkedListInsertingInBetween{
	Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	
	void display(){
		Node n = head;
		while(n!=null){
			System.out.print(n.data +"--->");
			n=n.next;
		}
	}
	
	void insertInBetween(Node prev_node, int value){
		Node newNode = new Node(value);
		newNode.next = prev_node.next;
		prev_node.next=newNode;
	}
	
	public static void main(String[] args){
		
		//craeting LL obj to access headpointer
		LinkedListInsertingInBetween l1 = new LinkedListInsertingInBetween();
		
		//allocating reference to head pointer of the first node 
		l1.head = new Node(10);
		Node second =new Node(20);
		Node third = new Node(30);
		
		l1.head.next=second;
		second.next=third;
		
	
		l1.insertInBetween(l1.head,50);
		l1.insertInBetween(l1.head.next,60);
		l1.display();
		
		
	}
}