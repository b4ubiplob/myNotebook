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
    
    @Test
    public void testRemoveFromEnd() {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        assertEquals("", singleLinkedList.getLinkedList());
        singleLinkedList.addNode(1);
        assertEquals("1>>", singleLinkedList.getLinkedList());
        singleLinkedList.addNode(2);
        assertEquals("1>>2>>", singleLinkedList.getLinkedList());
        singleLinkedList.addNode(3);
        assertEquals("1>>2>>3>>", singleLinkedList.getLinkedList());
        singleLinkedList.removeFromEnd();
        assertEquals("1>>2>>", singleLinkedList.getLinkedList());
        singleLinkedList.removeFromEnd();
        assertEquals("1>>", singleLinkedList.getLinkedList());
        singleLinkedList.removeFromEnd();
        assertEquals("", singleLinkedList.getLinkedList());
    }
    
    @Test
    public void testRemoveFromStart() {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        assertEquals("", singleLinkedList.getLinkedList());
        singleLinkedList.addNode(1);
        assertEquals("1>>", singleLinkedList.getLinkedList());
        singleLinkedList.addNode(2);
        assertEquals("1>>2>>", singleLinkedList.getLinkedList());
        singleLinkedList.addNode(3);
        assertEquals("1>>2>>3>>", singleLinkedList.getLinkedList());
        
        singleLinkedList.removeFromStart();
        assertEquals("2>>3>>", singleLinkedList.getLinkedList());
        singleLinkedList.removeFromStart();
        assertEquals("3>>", singleLinkedList.getLinkedList());
        singleLinkedList.removeFromStart();
        assertEquals("", singleLinkedList.getLinkedList());
    }
    
    @Test
    public void testDuplicates() {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        assertEquals("", singleLinkedList.getLinkedList());
        singleLinkedList.addNode(1);
        singleLinkedList.addNode(2);
        singleLinkedList.addNode(2);
        singleLinkedList.addNode(3);
        singleLinkedList.addNode(3);

        assertEquals("1>>2>>2>>3>>3>>", singleLinkedList.getLinkedList());
        singleLinkedList.removeDuplicates();
        assertEquals("1>>2>>3>>", singleLinkedList.getLinkedList());
    }

    
    @Test
    public void testGetValuefromLatsNodeIndex() {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        assertEquals("", singleLinkedList.getLinkedList());
        singleLinkedList.addNode(1);
        singleLinkedList.addNode(2);
        singleLinkedList.addNode(2);
        singleLinkedList.addNode(3);
        singleLinkedList.addNode(3);

        assertEquals("1>>2>>2>>3>>3>>", singleLinkedList.getLinkedList());
        int value = singleLinkedList.getValueFromLastNode(2);
        assertEquals(3, value);
        value = singleLinkedList.getValueFromLastNode(3);
        assertEquals(2, value);
    }

}
