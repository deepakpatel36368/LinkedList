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

    public Node addNodeInStart(Integer value){

        //Create new Node
        Node node = new Node();
        node.value= value;
        node.next = null;

        //point node next to first node
        node.next = head.next;

        //point head to newly created node.
        head = node;

        //Increase size of linked list
        size++;

        return head;
    }

    public void pop() {
        Node tempNode = head;

        //make tempNode to second last node
        for(int i =0; i<size-1; i++) {
            tempNode = tempNode.next;
        }
        // make second last node next as null
        tempNode.next=null;

        //point tail to second last node
        tail = tempNode;

        //reduce size of linked list
        size--;
    }

    public void popNodeFromStart() {
        Node tempNode = head.next;
        head = tempNode;
        size--;
    }

    public Node addNodeAtLocation(Integer value, Integer location) {
        Node node = new Node();
        node.value = value;
        node.next = null;

        Node tempNode = head;
        for(int i =0; i<location-1;i++){
            tempNode = tempNode.next;
        }

        //Store next node
        Node nextNode = tempNode.next;

        //point previous node
        tempNode.next = node;
        node.next = nextNode;

        size++;
        return null;
    }

    public void traverse() {
        Node tempnode = head;
        for(int i=0; i<size; i++){
            System.out.print(tempnode.value + "->");
            tempnode = tempnode.next;
        }
    }
}
