package org.example;

public class LinkedList {

    private Node head;
    private Node tail;
    private int size;
    LinkedList() {
        this.size = 0;
    }

    private class Node {
        private int data;
        private Node next;

        Node(int d) {
            data = d;
            next = null;
        }

        Node(int val, Node next) {
            this.data = val;
            this.next = next;
        }
    }

    // insert new node at the end of the linked list
    // maintain tail pointer
    // the benefit of using tail pointer is to insert/delete the element from the end in O(1) time
    public void insertLast(int val) {
        if(tail == null) {
            insertFirst(val);
            return;
        }
        Node new_node = new Node(val);
        tail.next = new_node;
        tail = new_node;
        size++;
    }

    // insert new node at the beginning of the linked list
    // maintain head and tail pointer
    public void insertFirst(int val) {
        Node new_node = new Node(val);
        new_node.next = head;
        head = new_node;

        if(tail == null) {
            tail = head;
        }
        size++;
    }

    // insert a node at a particular index
    public void insert(int val, int index) {
        if(index == 0) {
            insertFirst(val);
            return;
        }

        if(index == size) {
            insertLast(val);
            return;
        }

        if(index > size) {
            // should be handled using exceptions
            System.out.println("Cannot insert at index - " + index +  " ,as it is greater than the size of the list!");
            return;
        }

        Node temp = head;
        for(int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node new_node = new Node(val, temp.next);
        temp.next = new_node;
    }

    public void printList() {
        Node node = head;
        while(node != null) {
            System.out.print(node.data + " -> ");
            node = node.next;
        }
        System.out.println("null");
    }


}
