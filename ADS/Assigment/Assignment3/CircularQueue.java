import java.util.Scanner;

class CircularQueue{
	
	int front;
	int rear;
	int size;
	int cq[];
	int deletedElement[];
	int i;
	
	CircularQueue(int size){
		front=-1;
		rear=-1;
		this.size=size;
		cq=new int[size];
		deletedElement=new int[size];
	}
	
	void enqueue(int value){
		if(isFull()){
			System.out.println("Queue is full");
		}else{
			if(front==-1){
				front=0;
			}
			rear =(rear + 1)%size;
			cq[rear]=value;
		}
	}
	
	void dequeue(){
		if(isEmpty()){
			System.out.println("Queue is empty");
		}else{
			
			deletedElement[i]=cq[front];
			if(front==rear){
				front=-1;
				rear=-1;
			}else{
				front=(front+1)%size;
				i++;
			}
		}
	}
	
	void display(){
		if(isEmpty()){
			System.out.println("Queue is empty");
		}else{
			System.out.print("[");
			for(int j =front;j<=rear;j++){
				System.out.print(cq[j]+",");
			}
			System.out.print("]");
		}
	}
	
	boolean isEmpty(){
		return(front==-1);
	}
	
	boolean isFull(){
		return(rear>=size-1);
	}
	
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		//int size = sc.nextInt();
		CircularQueue cq1 = new CircularQueue(4);
		cq1.enqueue(4);
		cq1.enqueue(5);
		cq1.enqueue(6);
		cq1.enqueue(7);
		cq1.dequeue();
		cq1.enqueue(8);
		cq1.display();
		
		for(int k=0;k<=cq1.i;k++){
			System.out.print(cq1.cq[k]+",");
		}
		
	}
}