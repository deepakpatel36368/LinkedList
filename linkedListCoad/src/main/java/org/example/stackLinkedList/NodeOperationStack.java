package org.example.stackLinkedList;

public class NodeOperationStack {
    Node head;

    int size ;
    public void createStack(int value){

        head = new Node();
        size = 1;

        Node node = new Node();
        node.value = value;
        node.next = null;

        head = node;
    }

    public void pushStack(int value){

        Node node = new Node();
        node.value= value;
        node.next=head;
        head = node;
        size++;
    }

    public void popStack(){
        Node tempNode = head.next;
        head = tempNode;
        size--;
    }

    public void traverseStack(){
        Node tempNode = head;
        for(int i=0; i<size; i++) {
            System.out.print(tempNode.value + " -> ");
            tempNode = tempNode.next;
        }

        System.out.println();
    }
}
