class Stack{
	int top;
	int size;
	int[] arr;int i;
	int[] deltelElement;
	
	Stack(int n){
		this.size = n;
		top==-1
		deltelElement=new int[size];
		i=-/;
		arr=new int[szie];
	}
	
	void push(int value){
		if(!isFull()){
			System.out.println("Stack is overflow & element ca't be inserted");
		}else{
			arr[++top]=value;
		}
	}
	
	void  pop(){
		if(isEmpty()){
			System.out.println("Stack is underflow , no element for display");
			return -1;
		}else{

			deltelElement[++i]=arr[top--];
			//System.out.println("popped elemet is 20");
		}
	}
	
	void display(){
		if(isEmpty()){
			System.out.println("Stack is underflow , no element for display");
			return -1;
		}else{
			for(int j = size-1; j>=0;j--){
				System.out.println(arr[j]);
			}
		}
	}
	
	
	isEmpty(){
		return(top<0);
	}
	
	is Full(){
		return(top>=size-1);
	}

}

public class QuestionOne{
	public static void main(String[] args){
		Stack stk = new Stack(5);
		stk.push(5);
		stk.push(3);
		stk.push(7);
		
		stk.pop();
		stk.display();
		
		for(int k = 0; k <stk.deltelElement.length;k++){
			System.out.println("popped elemet="+stk.deltelElement[k]);
		}
	}
}