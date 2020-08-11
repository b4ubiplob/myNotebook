package linkedlist;

import java.util.HashSet;
import java.util.Set;

public class SingleLinkedList {

    private Node start;
    
    public void addNode(int num) {
        if (start == null) {
            start  = new Node(num);
        }
        else {
            Node newNode = new Node(num);
            Node presentNode = start;
            while (presentNode.getNext() != null) {
                presentNode = presentNode.getNext();
            }
            presentNode.setNext(newNode);
        }
    }
    
    public void removeFromStart() {
        if (start == null) {
            return;
        }
        if (start.getNext() == null) {
            start = null;
        }
        else {
            start = start.getNext();
        }
    }
    
    public void removeFromEnd() {
        if (start == null) {
            return;
        }
        Node presentNode = start;
        Node previousNode = null;
        while (presentNode.getNext() != null) {
            previousNode = presentNode;
            presentNode = presentNode.getNext();
        }
        if (previousNode == null) {
            start = null;
        }
        else {
            previousNode.setNext(null);
        }
    }
    
    public String getLinkedList() {
        StringBuilder list = new StringBuilder();
        Node currentNode = start;
        while (currentNode != null) {
            list.append(currentNode.getValue());
            list.append(">>");
            currentNode = currentNode.getNext();
        }
        return list.toString();
    }
    
    public void removeDuplicates() {
        Set<Integer> integerSet = new HashSet<>();
        Node currentNode = start;
        Node previousNode = null;
        while (currentNode != null) {
            if (integerSet.contains(currentNode.getValue())) {
                previousNode.setNext(currentNode.getNext());
            }
            else {
                integerSet.add(currentNode.getValue());
                previousNode = currentNode;
            }
            currentNode = currentNode.getNext();
        }
    }

}
