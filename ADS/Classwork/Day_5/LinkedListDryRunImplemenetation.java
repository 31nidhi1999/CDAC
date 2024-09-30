class LinkedListDryRunImplemenetation{
	
	//to refere to the starting node of LL
	Node head;
	
	//node to store data & refrence of next node
	//static because easy to access
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			data=d;
			next=null;
		}
	}
	
	void display(){
		
		//strong head value(ref of firrst node) because we can't shift head node
		Node n = head;
		
		//iterating to node
		while(n!=null){
			//acessing the data stored in n
			System.out.print(n.data +"--->");
			
			//trying to next ref to current ref
			n=n.next;
			
		}
	}
	
	
	
	public static void main(String[] args){
		
		//craeting LL obj to access headpointer
		LinkedListDryRunImplemenetation l1 = new LinkedListDryRunImplemenetation();
		
		//allocating reference to head pointer of the first node 
		l1.head = new Node(10);
		Node second =new Node(20);
		Node third = new Node(30);
		
		l1.head.next=second;
		second.next=third;
		
		l1.display();
		l1.
		
		
	}
	
}