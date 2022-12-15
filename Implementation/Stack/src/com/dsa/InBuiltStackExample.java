package com.dsa;

import java.util.Stack;

public class InBuiltStackExample {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
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
    }
}
