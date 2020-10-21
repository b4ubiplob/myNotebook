package binarytree;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestBinarySearchTree {
	
	@Test
	public void testInOrderTraversal() {
		BinarySearchTree binarySearchTree = new BinarySearchTree();
		
		binarySearchTree.addToBinaryTree(10);
		binarySearchTree.addToBinaryTree(5);
		binarySearchTree.addToBinaryTree(20);

		String result = binarySearchTree.inOrderTraversal();
		assertEquals("5>>10>>20>>", result);
		
		
	}
	
	@Test
	public void testPreOrderTraversal() {
		BinarySearchTree binarySearchTree = new BinarySearchTree();
		
		binarySearchTree.addToBinaryTree(10);
		binarySearchTree.addToBinaryTree(5);
		binarySearchTree.addToBinaryTree(20);

		String result = binarySearchTree.preOrderTraversal();
		assertEquals("10>>5>>20>>", result);
		
		
	}
	
	@Test
	public void testPostOrderTraversal() {
		BinarySearchTree binarySearchTree = new BinarySearchTree();
		
		binarySearchTree.addToBinaryTree(10);
		binarySearchTree.addToBinaryTree(5);
		binarySearchTree.addToBinaryTree(20);

		String result = binarySearchTree.postOrderTraversal();
		assertEquals("5>>20>>10>>", result);
		
		
	}

	

}
