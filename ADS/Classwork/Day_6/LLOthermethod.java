class LLOthermethod{
	Node head;
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			next = null;
		}
		
	}
	
	boolean detectLoop
	
	Node reverse(Node head1){
		Node prev=null, next=null;
		Node current = head1;
		
		while(current!=null){
			next=current.next;
			current.next=prev;
			prev = current;
			current=next;
		}
		head1 = prev;
		return head1;
	}
	
	boolean search(Node head,int value){
		Node search = head;
		while(search!=null){
			if(search.data==value)
				return true;
			search=search.next;
			
		}
		return false;
	}
	
	void append(int value){
		Node newNode = new Node( value);
		if(head==null){
			head=newNode;
			return;
		}
		Node append = head;
		while(append.next!=null){
			append=append.next;
		}
		append.next=newNode;
		return;
	}
	
	void deleteByValue(int key){
		if(head==null){
			System.out.println("LL is empty");
			return;
		}
		if(head!=null && head.data==key){
			head=head.next;
		}
		
		Node trav = head;
		Node prev = null;
		while(trav!=null && trav.data!=key){
			prev=trav;
			trav=trav.next;
		}
		prev.next=trav.next;
	}
	
	//deleted ll
	void deletedLL(){
		head=null;
	}
	
	int countRec(Node node){
		if(node==null){
			return 0;
		}
		return 1+countRec(node.next);
	}
	
	
	
	//diplay & also calculate no of nodes
	void display(Node head1){
		int c = 0;
		if(head==null){
			System.out.println("LL is empty");
		}
		Node last = head1;
		while(last!=null){
			c++;
			System.out.println(last.data);
			last=last.next;
		}
		System.out.println(c);
	}
	
	public static void main(String [] args){
		LLOthermethod om = new LLOthermethod();
		om.append(10);
		om.append(20);
		om.append(30);
		//om.deletedLL();
		Node headMain=om.head;
		om.display( headMain);
		System.out.println(om.countRec(headMain));
		System.out.println(om.search(headMain,30));
		System.out.println(om.search(headMain,40));
		Node rev = om.reverse(headMain);
		om.display(rev);
	}
}