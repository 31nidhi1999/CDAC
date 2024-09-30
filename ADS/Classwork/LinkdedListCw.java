// Linked lIst
import java.util.Scanner;
class LinkdedListCw{
		static Scanner sc = new Scanner(System.in);
	Node head;
	
	//Node structure
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			next=null;
		}
	}
	
	
	//inserting in beining of LL
	void insertAtFirst(int value){
		Node newNode = new Node(value);
		newNode.next=head;
		head=newNode;
		//System.out.println("LL was empty , first node created via insertAtFirst()");
	}
	
	//inserting at the end of LL
	void insertionAtEnd(int value){
		Node newNode = new Node(value);
		if(head==null){
			head = newNode;
			//System.out.println("LL was empty , first node created via insertionAtEnd()");
			// user return statement because we don't want to execute below statements
			return;
		}
		
		Node lastNode = head;
		while(lastNode.next !=null){
			lastNode=lastNode.next;
		}
		lastNode.next=newNode;
		//System.out.println(value+"inseted");
	}
	
	void insertInBetween(Node prev_node, int value){
		Node newNode = new Node(value);
		newNode.next = prev_node.next;
		prev_node.next=newNode;
	}

	/*void insertInBetween(int position,int value){
		Node nodeInBetw = new Node(value);
		Node trave = head;
		Node prev =null;
		for(int i = 0;trave.next!=null && i<position-1;i++){
			prev.next=trave;
			trave=trave.next;
		}
		nodeInBetw.next=prev.next;
		prev.next=nodeInBetw;
		
	}*/
	
	

	
	//deletion by value
	void deleteByValue(int key){
		//LL IS EMPTY OR NOT
		if(head==null){
			
			return;
		}
		
		if(head!=null && head.data==key){
			head=head.next;
			return;
		}
		
		//deletion element inbetween or from end
		Node trav =head;
		Node prev=null;
		while(trav!= null && trav.data!=key){
			prev=trav;
			trav=trav.next;
		}
		if(trav==null){
			System.out.println(key +" not present in LL");
			return;
		}
		prev.next=trav.next;
		
	}
	void deletedByPosition(int position){
		//check ll is empty
		Node trav = head;
		if(head==null){
			System.out.println("LL is empty");
		}
		if(position==0){
			head=trav.next;
		}
		
		for(int k = 0; trav!=null && k<position-1;k++){
			trav=trav.next;
		}
		if(trav==null || trav.next==null){
			return;
			/*
			trav==null :: no position
			trav.next end of ll
			*/
		}
		Node next=trav.next.next;
		trav.next=next;
		
	}
	
	
	//print all elements present in LL
	void display(){

		/*if(head==null){
			System.out.println("LinkedList is empty");
			return;
		}*/
		
		Node trav = head;
		
		while(trav!=null){
			System.out.print(trav.data+"--->");
			trav=trav.next;
		}
		System.out.println("");
	}
	
	public static int menuList(){
		
		System.out.println("1.Insert at Beigning");
		System.out.println("2.Insert at Ending");
		System.out.println("3.Insert IN Between");
		System.out.println("4.Deleting element from LLby value");
		System.out.println("5.Deleting element from LL by position");
		System.out.println("6.Display elements of LL");
		return (sc.nextInt());
	}
	
	public static void main(String[] args){
		LinkdedListCw ll = new LinkdedListCw();
		int ch=0;
		while((ch=menuList())!=0){
			switch(ch){
				case 1:
					ll.insertionAtEnd(sc.nextInt());
					break;
				case 2:
					ll.insertAtFirst(sc.nextInt());
					break;
				case 4:
					ll.deleteByValue(sc.nextInt());
					break;
				case 6:
					ll.display();
					break;
				case 3:
					//System.out.println("Enter the position ::");
					//int position = sc.nextInt();
					System.out.println("Enter the element ::");
					int value = sc.nextInt();
					//ll.insertInBetween(position,value);
					ll.insertInBetween(ll.head,value);
					break;
				case 5:
					ll.deletedByPosition(sc.nextInt());
			}
	
		}
		
	}
}
