package com.dsa;

public class StackImplementation {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int top = -1;

    public StackImplementation() {
        this(DEFAULT_SIZE);
    }

    public StackImplementation(int size) {
        this.data = new int[size];
    }

    public boolean push(int item) throws StackException {
        if(isFull()) {
            throw new StackException("Stack is full!!!");
        }

        top++;
        data[top] = item;
        return true;
    }

    public int pop() throws StackException {
        if(isEmpty()) {
            throw new StackException("Cannot pop from an empty stack!!!");
        }
        return data[top--];
    }

    public int peek() throws StackException {
        if(isEmpty()) {
            throw new StackException("Cannot peek from an empty stack!!!");
        }
        return data[top];
    }

    public boolean isFull() {
        return top == data.length - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public static void main(String[] args) throws StackException {
        StackImplementation stack = new StackImplementation();
        stack.push(30);
        stack.push(48);
        stack.push(9);
        stack.push(1);
        stack.push(88);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}