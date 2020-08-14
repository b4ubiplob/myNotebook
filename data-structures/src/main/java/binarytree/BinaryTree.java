package binarytree;

public class BinaryTree {
    
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
}
