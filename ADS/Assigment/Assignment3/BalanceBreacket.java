import java.util.Scanner;
class StackBalanceBracet{
	int top;
	int size;
	char[] arr;
	
	StackBalanceBracet(int n){
		this.size = n;
		top=-1;

		arr=new char[size];
	}
	
	void push(char value){
		if(isFull()){
			System.out.println("Stack is overflow & element ca't be inserted");
		}else{
			arr[++top]=value;
			//System.out.println(value +"is psuhed");
		}
	}
	
	int  pop(){
		if(isEmpty()){
			System.out.println("Stack is underflow , no element for display");
			return -1;
		}else{

		
			int valueDelected = arr[top--];
			return valueDelected;
		}
	}
	
	int peek(){
		if(isEmpty()){
			//System.out.println("Stack is underflow , no element for display");
			return -1;
		}else{
			int peek = arr[top];
			return peek;
		}
		
	}
	
	
	boolean isEmpty(){
		return(top<0);
	}
	
	boolean isFull(){
		return(top>=size-1);
	}

}

public class BalanceBreacket{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		StackBalanceBracet sbb = new StackBalanceBracet(str.length());
		for(int i = 0; i<str.length();i++){
			
			if(((char)sbb.peek()=='(' && str.charAt(i)==')') || 
			((char)sbb.peek()=='{' && str.charAt(i)=='}') || 
			((char)sbb.peek()=='[' && str.charAt(i)==']')){
				//System.out.println("deleted value ::"+(char)sbb.pop());
				sbb.pop();
			}else{
				sbb.push(str.charAt(i));
			}
		}
		
		if(sbb.top==-1){
			System.out.println("Balanced");
		}else{
			System.out.println("Not Balanced");
		}
	}
}


