package binary;

//create a simple binary tree ds.
//			1
//		   / \
//		  2   3
//		 /
//		4


public class BinaryTree {
	
	// create a node class
	public class Node{
		
		int data;
		Node left, right;
		
		Node(int data){
			this.data = data;
			this.left = this.right = null;
		}
		
	}
	
	//root node
	Node root;
	
	//constructor 
	public BinaryTree() {
		root = null;
	}
	
	public static void main(String[] args) {
		
		BinaryTree tree = new BinaryTree();
		
		tree.root = tree.new Node(1);
		tree.root.left = tree.new Node(2);
		tree.root.right = tree.new Node(3);
		
		tree.root.left.left = tree.new Node(4);

	}

}
