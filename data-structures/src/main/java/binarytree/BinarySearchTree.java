package binarytree;

public class BinarySearchTree {
    
    private BinaryTreeNode root;
    
    public void addToBinaryTree(int value) {
        root = addToBinaryTreeRecursive(root, value);
    }

    private BinaryTreeNode addToBinaryTreeRecursive(BinaryTreeNode current, int value) {
        if (current == null) {
             return new BinaryTreeNode(value);
        }
        if (current.getValue() > value) {
            current.setLeft(addToBinaryTreeRecursive(current.getLeft(), value));
        }
        else if (current.getValue() < value) {
            current.setRight(addToBinaryTreeRecursive(current.getRight(), value));
        }
        return current;
    }
    
    public String preOrderTraversal() {
    	StringBuilder sb = new StringBuilder();
    	preOrderTraversalRecursive(root, sb);
    	return sb.toString();
    }
    
    private void preOrderTraversalRecursive(BinaryTreeNode node, StringBuilder sb) {
    	if (node != null) {
    		sb.append(node.getValue());
    		sb.append(">>");
    		preOrderTraversalRecursive(node.getLeft(), sb);
    		preOrderTraversalRecursive(node.getRight(), sb);
    	}
    }
    
    public String inOrderTraversal() {
    	StringBuilder sb = new StringBuilder();
    	inOrderTraversalRecursive(root, sb);
    	return sb.toString();
    }
    
    private void inOrderTraversalRecursive(BinaryTreeNode node, StringBuilder sb) {
    	if (node != null) {
    		inOrderTraversalRecursive(node.getLeft(), sb);
    		sb.append(node.getValue());
    		sb.append(">>");
    		inOrderTraversalRecursive(node.getRight(), sb);
    	}
    }
    
    public String postOrderTraversal() {
    	StringBuilder sb = new StringBuilder();
    	postOrderTraversalRecursive(root, sb);
    	return sb.toString();
    }
    
    private void postOrderTraversalRecursive(BinaryTreeNode node, StringBuilder sb) {
    	if (node != null) {
    		postOrderTraversalRecursive(node.getLeft(), sb);
    		postOrderTraversalRecursive(node.getRight(), sb);
    		sb.append(node.getValue());
    		sb.append(">>");
    	}
    }
    
}
