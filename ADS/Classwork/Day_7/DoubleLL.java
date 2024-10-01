class DoubleLL{
	Node head;
	static class Node{
		int data;
		Node prev,next;
		Node(int data){
			this.data=data;
			prev=next=null;
		}
	}
	
	//
	void insertAtStart(int value){
		Node newNode = new Node(value);
		newNode.next=head;
		newNode.prev=null;
		if(head!=null){
			head.prev=newNode;
		}
		head=newNode;
	}
	
	void insertInBetween(Node prev,int value){
		if(prev==null){
			System.out.println("DLL is empty");
		}
		Node newNode=new Node(value);
		newNode.next=prev.next;
		newNode.prev=prev;
		prev.next=newNode;
		if(newNode.next!=null)
			newNode.next.prev=newNode;
	}
	
	void append(int value){
		Node newNode = new Node(value);
		Node last = head;
		newNode.next=null;
		if(head==null){ //ll is empty &  the first node is created
			newNode.prev=null;
			head=newNode;
			
		}
		while(last.next!=null){
			last=last.next;
		}
		last.next=newNode;
		newNode.prev=last;
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
	
	void deleteNode(Node del){
		
		//empty
		if(head==null || del ==null){
			return;
		}
		
		//if del == head
		if(head==del){
			head=del.next;
		}
		
		if(del.next !=null){
			del.next.prev=del.prev;
		}
		if(del.prev!=null){
			del.prevmext=del.next;
		}
		return;
	}
	
	public static void main(String[] args){
		DoubleLL dll = new DoubleLL();
		dll.insertAtStart(10);
		dll.insertAtStart(20);
		dll.insertInBetween(dll.head.next,30);
		dll.insertInBetween(dll.head,40);
		dll.append(50);
		dll.de
		dll.display(dll.head);
	}
}