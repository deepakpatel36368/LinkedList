package org.example;

public class Node {
    public Integer value;

    public Node next;
}

class NodeOperation {

    public Node head;
    public Node tail;
    Integer size = 0;
    public Node createLinkedList(Integer value) {
        // Create Head and tail node
        this.head = new Node();
        this.tail = new Node();

        //Create first Node
        Node node = new Node();
        node.value = value;
        node.next = null;

        //Point head and tail to first node
        head = node;
        tail = node;
        size = 1;

        //return head
        return head;
    }

    public Node push(Integer value) {
        // Create New Node
        Node node = new Node();
        node.value = value;
        node.next = null;

        // Point last Node to new node
        tail.next = node;

        //Point tail to new node
        tail = node;
        size = size +1;
        return node;
    }

    public void traverse() {
        Node tempnode = head;
        for(int i=0; i<size; i++){
            System.out.print(tempnode.value + "->");
            tempnode = tempnode.next;
        }
    }
}
