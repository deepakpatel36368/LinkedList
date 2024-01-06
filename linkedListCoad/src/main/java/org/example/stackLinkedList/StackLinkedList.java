package org.example.stackLinkedList;

public class StackLinkedList {

    public static void main(String[] args) {
        NodeOperationStack nodeOperationStack = new NodeOperationStack();
        nodeOperationStack.createStack(10);
        nodeOperationStack.pushStack(20);
        nodeOperationStack.pushStack(30);
        nodeOperationStack.traverseStack();
        nodeOperationStack.popStack();
        nodeOperationStack.traverseStack();
    }

}
