// Simple Qeeue with array implemenetation
class SimpleQueue{
	
	//i not neccesary just use to check if we deleted queue midle then front & raer is set to -1 or not
	
	
	static int i;
	//decalring size,front,rear & arry impl queuue
	int size;
	int front,rear;
	int[] queue = new int[size];
	
	
	//initiazlize size,front & rear
	SimpleQueue(int size){
		this.size = size;
		front=-1;
		rear=-1;
		queue = new int[size];
	}
	
	//insertion :: check queue is empty or else insert value using rear
	void enequeue(int value){

		if(isFull()){
			System.out.println("Queue is Full");
		}else{
			if(front==-1){
				front=0;
			}
			//we are not writing blow code in else condition because if we wrtite then first element will not get inserted
			queue[++rear]=value;
			System.out.println(i+" position : "+value +" inserted");
			i++;
		}
		
		
	}
	
	
	//delection :: chek queue is empty or else delete value from front 
	int deqnqueue(){
		if(isEmpty()){
			System.out.println("queue is empty");
			return -1;
		}else{
			int valueDeleted = queue[front];
			if(front>rear){
				front=-1;
				rear =-1;
				i=0;
				System.out.println("Now queue is enmpty");
				
			}else{
				front++;
			}
			return valueDeleted;
		}
	}
	
	
	//display
	void display(){
		if(isEmpty()){
				System.out.println("Queue is empty can't dispaly the queue");
		}else{
			for(int i = front;i<=rear;i++){
				System.out.println(queue[i]);
			}
		}
		
		
	}
	
	
	//checking empty
	boolean isEmpty(){
		return (front==-1);
	}
	
	//checking full
	boolean isFull(){
		return (rear>=size-1);
	}
	
	public static void main(String[] args){
		SimpleQueue sq = new SimpleQueue(5);
		
		sq.enequeue(10);
		sq.enequeue(20);
		sq.enequeue(30);
		//sq.enequeue(40);
		//sq.enequeue(50);
		System.out.println("Deleted ::"+sq.deqnqueue());
		System.out.println("Deleted ::"+sq.deqnqueue());
		System.out.println("Deleted ::"+sq.deqnqueue());
		System.out.println("Deleted ::"+sq.deqnqueue());
		sq.display();

		sq.enequeue(40);
		sq.enequeue(50);
		sq.enequeue(60);
		
	}
}