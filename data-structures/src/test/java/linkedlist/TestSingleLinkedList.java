package linkedlist;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestSingleLinkedList {
    
    @Test
    public void testAdd() {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        assertEquals("", singleLinkedList.getLinkedList());
        singleLinkedList.addNode(1);
        assertEquals("1>>", singleLinkedList.getLinkedList());
        singleLinkedList.addNode(2);
        assertEquals("1>>2>>", singleLinkedList.getLinkedList());
        singleLinkedList.addNode(3);
        assertEquals("1>>2>>3>>", singleLinkedList.getLinkedList());
        
    }

}
