package binary;

//Binary search tree
//Ordered tree

public class BinarySearchTree {
	
	//create node class
	public class Node{
		int data;
		Node left, right;
		
		Node(int data){
			this.data = data;
			this.right = this.left = null;
		}
	}
	
	// current root node
	Node root;
	
	public BinarySearchTree() {
		root = null;
	}
	
	// insert data into Binary search tree (recursive)
	private Node insertion(Node root, int data) {
		if (root == null) {
			root = new Node(data);
			return root;
		}
		if(root.data > data) {
			root.left = insertion(root.left, data);
		}
		else if(root.data < data) {
			root.right = insertion(root.right, data);
		}
		
		return root;
	}
	
	// pre-order traversal (root, left, right)
	private void preOrder(Node root) {
		if(root == null) {
			return;
		}
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
		
	}
	
	//in-order traversal (left, root, right)
	// sorted order
	private void inOrder(Node root) {
		if(root == null) {
			return;
		}
		
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
		
	}
	
	//post-order traversal (left, right, root)
	private void postOrder(Node root) {
		if(root == null) {
			return;
		}
		
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data+" ");
		
	}

	public static void main(String[] args) {
		
		BinarySearchTree tree = new BinarySearchTree();
		
		// input
		int[] arr = {4, 2, 5, 1, 3};
		
		// insertion to the tree
		for(int i:arr) {
			tree.root = tree.insertion(tree.root, i);
		}
		
		System.out.println("pre-order");
		
		tree.preOrder(tree.root);
		
		System.out.println("\nin-order");
		
		tree.inOrder(tree.root);
		
		System.out.println("\npost-order");
		
		tree.postOrder(tree.root);
	}

}
