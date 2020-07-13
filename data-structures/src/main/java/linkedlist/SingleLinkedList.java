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
