class Stack2{
	
	//top to delete or insert
	private int top;
	private int[] arr;
	private int MAXVALUE;
	
	Stack2(int size){
		top=-1;
		this.MAXVALUE=size;
		arr= new int[MAXVALUE];
	}
	
	//to check statck is empty or not
	boolean isEmpty(){
		return (top<0);
	}
	
	boolean isFull(){
		return (top>=MAXVALUE-1);
	}
	
	//push
	void  push(int value){
		if(!isFull()){
			arr[++top]=value;
		}else{
			System.out.println("Stck is Overflow");
		}
	}
	
	//pop
	int pop(){
		int deletedValue;
		if(!isEmpty()){
			deletedValue = arr[top--];
		}else{
			System.out.println("Stck is underflow");
			return -1;
		}
		return deletedValue;
	}
	
	int peek(){
		int peekValue;
		if(!isEmpty()){
			peekValue = arr[top];
		}else{
			System.out.println("Stck is underflow");
			return -1;
		}
		
		return peekValue;
	}
	
	public static void reverse(StringBuffer str){
		
		
		int size = str.length();
		Stack2 stk = new Stack2(size);
		
		for(int i=0;i<size;i++){
			stk.push(str.charAt(i));
		}
		
		for(int i=size; i>-1;i--){
			System.out.println((char)stk.pop());
		}
			
			
	}
	
	
	public static void main(String[] agrs){
		StringBuffer sb = new StringBuffer("Nidhi Nayak");
		reverse(sb);
		
	}
}