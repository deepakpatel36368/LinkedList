package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("********* Linked List Operations *********");

        NodeOperation operation = new NodeOperation();
        operation.createLinkedList(5);
        operation.push(10);
        operation.push(15);
        operation.traverse();
        operation.pop();
        System.out.println();
        operation.traverse();
        System.out.println();
        operation.addNodeInStart(20);
        operation.traverse();

        System.out.println();
        operation.popNodeFromStart();
        operation.traverse();

        System.out.println();
        operation.push(20);
        operation.push(30);
        operation.push(40);
        operation.push(50);
        operation.traverse();

        System.out.println();
        operation.addNodeAtLocation(100, 2);
        operation.traverse();
    }
}