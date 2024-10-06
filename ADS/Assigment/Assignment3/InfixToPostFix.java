/**
 * a+b*(c^d-e)
 * stack    string
 * +		a
 * +		ab
 * +*		ab
 * +*(		abc
 * +*(*     abc
 * +*(^     abcd
 * +*(      abcd^
 * +*(-		abcde
 * +*(			abcde-
 * 	+		abcde-*+
 * */


package in.co.stack;

public class InfixToPostFix {
	
	int top,size;
	char[] arr;
	
	public InfixToPostFix(int size) {
		this.size=size;
		arr = new char[size];
	}
	
	void push(char value) {
		if(isFull()) {
			System.out.println("Stack is Full");
		}else {
			arr[++top]=value;
			//System.out.println("push"+value);
		}
	}
	
	void  pop() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			
		}else {
			char valueDeleted = arr[top--];
			//System.out.println("pop"+valueDeleted);
		}
	}
	
	char peek() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			return '0';
			
		}else {
			return arr[top];
		}
	}
	
	
	
	boolean isEmpty() {
		return top<0;
	}
	
	boolean isFull() {
		return top>=size-1;
	}
	
	public String popstillopeningBracket(InfixToPostFix stk, char ch) {
		String strB = "";
		while(stk.peek()!='(' && !stk.isEmpty()) {
			
			strB += stk.peek();
			stk.pop();
		}
		//too pop out opeing bracket
		if(stk.peek()=='(') {
			stk.pop();
		}
			
		return strB;
	}
	
	public int priority(char ch) {
		int p=-1;
		if(ch =='^') {
			 p= 3;
		}else if(ch=='*' || ch=='/') {
			 p = 2;

		}else if(ch=='+') {
			 p = 1;
		}else if(ch=='-') {
			p=0;
		}
		return p;
	}
	
	public String pushOrPopPiority(InfixToPostFix stk, char ch,int p) {
		String stroperand="";
		while(!isEmpty() && p<=stk.priority(stk.peek())) {
			stroperand += stk.peek();
			stk.pop();
		}
		stk.push(ch);
		return stroperand;
	}
	
	public String operation(InfixToPostFix stk, char ch) {
		String operand="";
		if(Character.isLetter(ch)){
			operand  += ch;
		}
		else if(ch=='('){
			stk.push(ch);
		}else if(ch==')') {
			operand+=stk.popstillopeningBracket(stk, ch);
		}else {
			int p = stk.priority(ch);
			operand+=stk.pushOrPopPiority(stk, ch, p);
		}
		
		return operand;
	}

	public static void main(String[] args) {
		
		String str = " A^B+C";
		InfixToPostFix stk = new InfixToPostFix(str.length());
		String strop="";
		for(int i = 0; i < str.length();i++) {
			char ch = str.charAt(i);
			strop+= stk.operation(stk,ch);
			
			
		}
		while(!stk.isEmpty()) {
			strop = strop + stk.peek();
			stk.pop();
		}
		
		System.out.println(strop);

	}

}
