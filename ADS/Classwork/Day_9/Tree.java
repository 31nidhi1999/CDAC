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
	Tree(int value){
		root = new Node(value);
	}
	
	Node  insert(Node root, int value){
		//tree is empty then create new node
		if(root == null){
			root = new Node(value);
			return root;
		}
		if(value<=root.data){
			root.left = insert(root.left,value);
		}else{
			root.right=insert(root.right,value);
		}
		return root;
	}
	
	Node deletion(Node root, int value){
		if(root==null){
			return root;
		}
		if(value<root.data){
			root.left = deletion(root.left,value);
		}else if(value>root.data){
			root.right=deletion(root.right,value);
			root.right=deletion(root.right,value);
		}else{
			//case1 %
			if(root.left==null){
				return root.right;
			}else if(root.right==null){
				return root.left;
			}
			//case3
			root.data=minValue(root.right);
			root.right=deletion(root.right,root.data);
			
		}
		return root;
		
	}
	int minValue(Node root){
			int x = root.data;
			while(root.left!=null){
				x=root.left.data;
				root=root.left;
			}
			return x;
	}
	
	void inorder(Node root){
		inorderTrav(root);
	}
	
	void inorderTrav(Node root){
		if(root==null){
			return;
		}
		inorderTrav(root.left);
		System.out.print(root.data+ " ");
		inorderTrav(root.right);
	}


	public static void main(String[] args){
		Tree tree = new Tree();
		tree.insert(tree.root,77);
		tree.inorder(tree.root);
	}
}