class Stack{
	int top;
	int size;
	int[] arr;
	int i;
	int[] deltelElement;
	
	Stack(int n){
		this.size = n;
		top=-1;
		deltelElement=new int[size];
		i=-1;
		arr=new int[size];
	}
	
	void push(int value){
		if(isFull()){
			System.out.println("Stack is overflow & element ca't be inserted");
		}else{
			arr[++top]=value;
		}
	}
	
	void  pop(){
		if(isEmpty()){
			System.out.println("Stack is underflow , no element for display");

		}else{

			deltelElement[++i]=arr[top--];
			//System.out.println("popped elemet is 20");
		}
	}
	
	void display(){
		
		if(isEmpty()){
			System.out.println("Stack is underflow , no element for display");

		}else{
			System.out.print("[");
			for(int j = 0; j<size-1;j++){
				if(j==0){
					System.out.print(arr[j]);
				}else{
					System.out.print(","+arr[j]);
				}
				
			}
			System.out.print("],");
		}
	}
	
	
	boolean isEmpty(){
		return(top<0);
	}
	
	boolean isFull(){
		return(top>=size-1);
	}

}

public class QuestionOne{
	public static void main(String[] args){
		Stack stk = new Stack(3);
		/*test case 1*/
		stk.push(5);
		stk.push(3);
		stk.push(7);
		
		stk.pop();
		stk.display();
		for(int k = 0; k <=stk.i;k++){
			System.out.println("popped elemet="+stk.deltelElement[k]);
		}
		
		/*test case 2*/
		Stack stk1 = new Stack(3);
		stk1.push(10);
		stk1.push(20);
		stk1.pop();
		stk1.push(15);
		stk1.display();
		for(int k = 0; k <=stk1.i;k++){
			System.out.println("popped elemet="+stk1.deltelElement[k]);
		}
	}
}