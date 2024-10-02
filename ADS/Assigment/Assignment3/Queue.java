import java.util.Scanner;
class Queue{
	
	int front;
	int rear;
	int arr[];
	int size;
	int deletedElement[];
	int i;
	
	public Queue(int size){
		front=-1;
		rear=-1;
		this.size=size;
		arr=new int[size];
		deletedElement=new int[size];
	}
	
	void enqueue(int value){
		if(isFull()){
			System.out.println("Queue is Full");
		}else{
			if(front==-1){
				front=0;
			}
			arr[++rear]=value;
		}
	}
	
	void dequeue(){
		if(isEmpty()){
			System.out.println("Queue is Empty");
		}else{
			deletedElement[i] = arr[front];
			if(front>rear){
				front=-1;
				rear=-1;
				
			}else{
				front++;
				i++;
			}
		}
	}
	
	void display(){
		if(isEmpty()){
			System.out.print("Queue is Empty");
		}else{
			System.out.print("[");
			for(int j = front;j<=rear;j++){
					System.out.print(","+arr[j]);
			}
			System.out.print("]");
		}
	}
	
	boolean isEmpty(){
		return (front==-1);
	}
	
	boolean isFull(){
		return(rear>=size-1);
	}
	
	public static void main(String[] agrs){
		//int size = sc.nextInt();
		Queue q = new Queue(3);
		
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.dequeue();
		q.dequeue();
		q.display();
		System.out.print(", Dequeued elements = ");
		for(int k =0; k<q.i;k++){
			System.out.print(q.deletedElement[k]+",");
		}
	}
}