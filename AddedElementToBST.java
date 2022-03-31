package com.bridgelabz.BST;

public class BinarySearchTree {
	

	// Represent the root of binary tree
	 Node root;


	// insert() will add new node to the binary search tree
	 void insert(int data) {
	
		 Node newNode = new Node(data);

		// Check whether tree is empty
		if (root == null) {
			root = newNode;
			return;
		} else {
			// current node point to root of the tree
			Node current = root, parent = null;

			while (true) {
				// parent keep track of the parent node of current node.
				parent = current;

				// If data is less than current's data, node will be inserted to the left of
				// tree
				if (data < current.data) {
					current = current.left;
					if (current == null) {
						parent.left = newNode;
						return;
					}
				}
				// If data is greater than current's data, node will be inserted to the right of
				// tree
				else {
					current = current.right;
					if (current == null) {
						parent.right = newNode;
						return;
					}
				}
			}
		}
	}

	// minNode() will find out the minimum node
	 Node minNode(Node root) {
		if (root.left != null)
			return minNode(root.left);
		else
			return root;
	}

	// Display() will perform Display traversal on binary search tree
	 void Display(Node node) {

		if (root == null) {
			System.out.println("Tree is empty");
			return;
		} else {

			if (node.left != null)
				Display(node.left);
			System.out.print(node.data + " ");
			if (node.right != null)
				Display(node.right);

		}
	}
}


