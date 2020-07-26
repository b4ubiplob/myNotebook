package linkedlist;

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
            Node deletedNode = start;
            start = start.getNext();
            deletedNode = null;
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
            previousNode.next = null;
        }
    }
    
    public String getLinkedList() {
        StringBuilder list = new StringBuilder();
        Node currentNode = start;
        while (currentNode != null) {
            list.append(currentNode.getValue());
            list.append(">>");
            currentNode = currentNode.next;
        }
        return list.toString();
    }
}
