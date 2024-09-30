class LinkedList{
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
	
	
	//inserserting at last
	void append(int value){
		Node newNode =  new Node(value);
		if(head==null){
			head=newNode;
		}
		Node last = head;
		while(last.next!=null){
			last=last.next;
			
		}
		last.next=newNode;
	}
	
	
	
	void deletition(int key){
		Node temp=head;
		Node prev=null;
		//deletion at begianing
		if(temp!=null && temp.data==key){
			head=temp.next;
		}
		
		
		//deletion inbetween & end
		while(temp!=null && temp.data!=key){
			prev=temp;
			temp=temp.next;
		}
		if(temp==null){
			System.out.println(key+"value not found in LL ");
		}
		prev.next=temp.next;
	}
	
	void deleteAtPosition(int position){
		Node temp=head;
		//check list is empty or not
		if(head==null){
			return;
		}
		
		//deletion at begining
		if(position==0){
			head=temp.next;
		}
		
		for(int i =0; temp!=null && i<position-1;i++){
			temp=temp.next;
		}
		if(temp==null || temp.next==null){
			return;
		}
		Node next=temp.next.next;
		temp.next=next;
	}
	
	
	
	public static void main(String[] args){
		
		//craeting LL obj to access headpointer
		LinkedList l1 = new LinkedList();
		
		//allocating reference to head pointer of the first node 
		l1.append(80);
		//l1.head = new Node(10);
		
		//Node second =new Node(20);
		//Node third = new Node(30);
		
		//l1.head.next=second;
		//second.next=third;
		
		
		l1.insertAtFirst(40);
		l1.insertInBetween(l1.head,50);
		l1.insertInBetween(l1.head.next,60);
		l1.append(70);
		//l1.deletition(60);
	    //l1.deleteAtPosition(5);
		l1.display();
		
		
	}
}