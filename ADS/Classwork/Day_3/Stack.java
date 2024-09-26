//remember as we are using array then index start with 0 

import java.util.Scanner;
class Stack{
	
	// need to defined size beacuse we ar using array
	 static final int MAX =10;
	
	//from where we can insert &  delete or access the element
	 int top;
	
	//Define a array
	 int a[] = new int[MAX];
	
	//to initiazlize NSV 
	Stack(){
			top=-1;
		}
	
	//to check statck is empty or not , not then return element
	 boolean isEmpty(){
		return (top<0);
	}
	
	//first to check stack is fulled or not, not then insert elemet
	 boolean push(int n){
		if(top>=MAX -1){
			System.out.println("StackOverflow");
			return false;
		}
		a[++top] = n;
		return true;
	}
	
	//first to check the stack is overflow , not then delete the element
	 int pop(){
		if( top < 0){
			System.out.print("StackOverflow");
			return 0;
		}
		int x = a[--top];
		return x;
	}
	
	//to check if the stack is underflow or npt, not then we can access the element value present in pops
	 int peek(){
		return (top < 0)? 0 :a[top];
	}
	
	//print statck
	void display(){
		if(isEmpty()){
			System.out.println("Stack is empty");
		}
		System.out.println(top);
		show(top);
	}
	
	//print show
	void show(int index){
		if(index==-1)
			return;
		
		System.out.println(a[index]);
		show(index -1);
	}
	
	public static  void main(String[] args ){
		Stack stk = new Stack();
		
		System.out.println(stk.isEmpty());
		System.out.println(stk.push(10));
		System.out.println(stk.push(20));
		System.out.println(stk.push(30));
		
		stk.display();
		
		//System.out.println(stk.pop());
		//stk.display();
	}
}