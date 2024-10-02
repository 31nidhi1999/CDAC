import java.util.Scanner;

class Stack{
	int max;
	int top;
	char[] strArr;
	
	Stack(int size){
		top=-1;
		this.max = size;
		strArr = new char[size];
	}
	
	void push(char value){

		if(isFull()){
			System.out.println("Stck is overflow");
			
		}else{
			strArr[++top]=value;
		
		}
	}
	
	void display(){
		if(isEmpty()){
			System.out.println("Stack is underflow");
		}else{
			show(top);
		}
	}
	
	boolean isEmpty(){
		return(top<0);
	}
	
	boolean isFull(){
		return (top>=max-1);
	}
	
	void show(int index){
		if(index==-1){
			return;
		}
		System.out.print(strArr[top--]);
		show(index -1);
	}
}
class ReverseString{
	

	private static Scanner sc = new Scanner(System.in);
	public static void reverse(String str){
		Stack stk = new Stack(str.length());
		for(int i = 0;i<str.length();i++){
			stk.push(str.charAt(i));
		}
		
		stk.display();
	}
	
	public static void main(String[] args){
		
		String str = sc.nextLine();
		
		reverse(str);
	}
	
	
}



/*
for push O(1)
for for loop O(n)
Overall space complextiy :: O(n) TC
*/