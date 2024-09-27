class CircularQueue{
	
	int rear,front,size;
	int[] cq = new int[size];
	
	CircularQueue(int size){
		this.size=size;
		front=-1;
		rear=-1;
		cq= new int[this.size];
		System.out.println("front & rear initialized");
	}
	
	void enqueue(int value){
		if(isFull()){
			System.out.println("Queue is Full");
		}else{
			if(front==-1){
				front =0;
			}
		    rear=(rear + 1)%size;
			cq[rear]=value;
			System.out.println(value+" inserted");

		}
	}
	
	int denqueue(){
		if(isEmpty()){
			System.out.println("Queue is empty");
			return -1;
		}else{
			int valueDeleted = cq[front];
			if(front==rear){
				front=-1;
				rear=-1;
			}else{
				front = (front+1)%size;
			}
			return valueDeleted;
		}
	}
	
	void display(){
		if(isEmpty()){
			System.out.println("Queue is empty");
		}else{
			int i = front;
			for(i=0;i<=rear;i++){
				System.out.println(cq[i]);
			}
		}
	}
	
	boolean isEmpty(){
		return(front==-1);
	}
	
	boolean isFull(){
		return (((rear + 1)%size)==front);
	}
	
	public static void main(String[] args){
		CircularQueue cq = new CircularQueue(5);
		
		cq.enqueue(10);
		cq.enqueue(20);
		cq.enqueue(30);
		
		cq.display();
		
		System.out.println("Deleted ::"+cq.denqueue());
		System.out.println("Deleted ::"+cq.denqueue());
		System.out.println("Deleted ::"+cq.denqueue());
		System.out.println("Deleted ::"+cq.denqueue());
		
	}
	
}