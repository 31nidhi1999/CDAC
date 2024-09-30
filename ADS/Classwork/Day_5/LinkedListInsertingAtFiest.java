class LinkedListInsertingAtFiest{
	Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	
	void insertAtFirst(int value){
			Node newNode = new Node(value);
			newNode.next=head;
			head = newNode;
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
		LinkedListInsertingAtFiest l1 = new LinkedListInsertingAtFiest();
		
		//allocating reference to head pointer of the first node 
		l1.head = new Node(10);
		Node second =new Node(20);
		Node third = new Node(30);
		
		l1.head.next=second;
		second.next=third;
		
		
		
		l1.insertAtFirst(40);
		l1.insertInBetween(l1.head,50);
		l1.insertInBetween(l1.head.next,60);
		l1.display();
		
		
	}
}