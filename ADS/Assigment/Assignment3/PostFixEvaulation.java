import java.util.Scanner;
class StackPostFixEvaluation{
	int top;
	int size;
	String[] strArr;
	
	StackPostFixEvaluation(int size){
		top=-1;
		this.size = size;
		strArr=new String[size];
	}
	
	void push(String str){
		if(isFull()){
			System.out.println("Stack is overflow");
		}else{
			strArr[++top]=str;
		}
	}
	
	String pop(){
		if(isEmpty()){
			System.out.println("Stack is Underflow");
			return "";
		}else{
			return strArr[top--];
		}
	}
	
	boolean isEmpty(){
		return(top<0);
	}
	
	boolean isFull(){
		return (top>=size-1);
	}
}

public class PostFixEvaulation{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String ans=null;
		StackPostFixEvaluation spfe = new StackPostFixEvaluation(str.length());
		for(int i =0; i < str.length();i++){
			if(str.charAt(i)=='*' ||
			   str.charAt(i)=='/' ||
			   str.charAt(i)=='+' ||
			   str.charAt(i)=='-'
			){
				String a = spfe.pop();
				String b = spfe.pop();
				switch(str.charAt(i)){
					case '*':
						ans = b+"*"+a;
						break;
					case '/':
						ans = b +"/"+ a;
						break;
					case '-':
						ans = b+"-"+a;
						break;
					case '+':
						ans = b +"+"+ a;
						break;
				}
				spfe.push(ans);
			}else{
				spfe.push(String.valueOf(str.charAt(i)));
			}
		}
	}
}