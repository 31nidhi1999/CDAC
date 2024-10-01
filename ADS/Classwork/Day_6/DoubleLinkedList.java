class DoubleLinkedList{
	Node head;
	
	static class Node{
		int data;
		Node prev,next;
		Node(int value){
			data=value;
			prev=null;
			next=null;
		}
	}
	
	void insertAtStart(int value){
		Node newNode =new Node(value);
		newNode.next=head;
		newNode.prev=null;
		
		if(head!=null)
			head.prev=newNode;
		
		head=newNode;
		  
		
	}
	
	void display(Node n){
	Node p = null;
		System.out.println("Ener element in forward direction ::");
		while(n!=null){
			System.out.print(n.data+"--->");
			p=n;
			n=n.next;
			
		}
		System.out.println("\nEner element in reverse direction ::");
		while(p!=null){
			System.out.print(p.data+"<---");
			p=p.prev;
		}
		
		
	}
	
	public static void main(String[] args){
		DoubleLinkedList dll = new DoubleLinkedList();
		dll.insertAtStart(1);
		dll.insertAtStart(2);
		dll.insertAtStart(3);
		
		dll.display( dll.head);
	}
}