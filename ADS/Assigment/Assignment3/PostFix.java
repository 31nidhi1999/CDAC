import java.util.Scanner;
class StackPostFix{
	int top;
	int size;
	int[] arr;

	
	StackPostFix(int n){
		this.size = n;
		top=-1;

		arr=new int[size];
	}
	
	void push(int value){
		if(isFull()){
			System.out.println("Stack is overflow & element ca't be inserted");
		}else{
			arr[++top]=value;
			System.out.println(value +"is psuhed");
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

public class PostFixNubericEvaulation{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int ans = 0;
		StackPostFix spf = new StackPostFix(str.length());
		
		for(int i = 0; i<str.length();i++){
			
			if(str.charAt(i)=='*'  ||
			   str.charAt(i)=='/'  ||
			   str.charAt(i)=='-'  ||
			   str.charAt(i)=='+'  
			 ){
				//System.out.println("deleted value ::"+(char)sbb.pop());
				int a = spf.pop();
				int b = spf.pop();
				switch(str.charAt(i)){
					case '*':
						ans = a * b;
						break;
					case '/':
						ans = b / a;
						break;
					case '-':
						ans = b-a;
						break;
					case '+':
						ans = a + b;
						break;
				}
				spf.push(ans);
			}else{
				
				spf.push(Character.getNumericValue(str.charAt(i)));
			}
		}
		
		System.out.println(ans);
	}
}




