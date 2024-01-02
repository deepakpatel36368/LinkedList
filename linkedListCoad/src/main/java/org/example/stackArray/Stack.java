package org.example.stackArray;

/**
 * Stack is a data structure that store item in a
 * LAST in FIRST out (LIFO)
 */
public class Stack {

    int[] stack;

    int topOfStack;

    public int[] createStack(int size) {
        this.stack = new int[size];
        this.topOfStack=-1;

        return stack;
    }

    public boolean isEmpty(){
        if(this.topOfStack== -1 && stack != null){
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull(){
        if(this.topOfStack == stack.length-1){
            return true;
        } else {
            return false;
        }
    }

    public void push(int value) {
        if(isFull()){
            System.out.println("Stack is Full");
        } else {
            this.topOfStack++;
            stack[this.topOfStack]=value;
        }
    }

    public void pop() {
        if(isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            this.topOfStack--;
        }
    }

    public void deleteStack(){
        stack =null;
        topOfStack =-1;
        System.out.println("Whole stack deleted");
    }

    public void traverseStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            for (int i = this.topOfStack; i >= 0; i--) {
                System.out.println(this.topOfStack + "--" + stack[i]);
            }
        }
    }

    public static void main(String[] args) {
        Stack stackOperations = new Stack();
        stackOperations.createStack(10);
        stackOperations.push(20);
        stackOperations.push(30);
        stackOperations.push(40);
        stackOperations.push(50);
        stackOperations.push(60);
        stackOperations.traverseStack();

        stackOperations.pop();
        stackOperations.deleteStack();
        stackOperations.traverseStack();

    }
}
