/**
How to Travers in Tree
1)Pre oder traversal
2)In order traversal
3)post oder traversal

*/

class Tree{
	
	//starting point of the tree
	Node root;
	
	//Node structure
	static class Node{
		int data;
		Node left;
		Node right;
		
		Node(int value){
			this.data=value;
			left=right=null;
		}
	}
	
	//kepting root as null
	Tree(){
		root=null;
	}
	
	//initiazlie first node 
	/*Tree(int value){
		root = new Node(value);
	}*/
	
	void insert(int value){
		
	}
	
	void delete(){
		
	}
	
	void inorder(){
		inoderTravs(root);
	}
	
	void preoder(){
		preoderTravs(root);
	}
	
	void postoder(){
		postoderTravs(root);
	}
	
	void inoderTravs(Node node){
		if(node==null)
			return;

		inoderTravs(node.left);
		System.out.print(node.data+" ");
		inoderTravs(node.right);
		
	}
	
	void preoderTravs(Node node){
		if(node==null)
			return;

		System.out.print(node.data+" ");
		preoderTravs(node.left);
		preoderTravs(node.right);
		
	}
	
	void postoderTravs(Node node){
		if(node==null)
			return;

		
		
		postoderTravs(node.left);
		postoderTravs(node.right);
		System.out.print(node.data+" ");
		
	}
	
	public static void main(String[] args){
		Tree tree = new Tree();
		
		//root node initiaztlization
		tree.root=new Node(11);
		
		tree.root.left = new Node(22);
		tree.root.right=new Node(33);
		
		tree.root.left.left=new Node(44);
		tree.root.left.right=new Node(55);
		
		System.out.println("\nInorder");
		tree.inorder();
		System.out.println("\npreorder");
		tree.preoder();
		System.out.println("\npostorder");
		tree.postoder();
	}
}