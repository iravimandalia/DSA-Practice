package com.dsa;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NextGreaterElement {

    public static List<Integer> nge(int[] arr) {
        List<Integer> ngeList = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        for(int i = arr.length - 1; i >= 0; i--) {
            if(stack.empty()) {
                ngeList.add(-1);
            }
            else if(!stack.empty() && stack.peek() > arr[i]) {
                ngeList.add(stack.peek());
            }
            else if(!stack.empty() && stack.peek() <= arr[i]) {

                while(!stack.empty() && stack.peek() <= arr[i])
                    stack.pop();

                if(stack.empty())
                    ngeList.add(-1);
                else
                    ngeList.add(stack.peek());
            }
            stack.push(arr[i]);
        }
        return ngeList;
    }

    public static void main(String[] args) {
        int[] arr = {2, 10, 12, 1, 11};
        List<Integer> ngeList = nge(arr);

        for(int i = ngeList.size() - 1; i >= 0; i--) {
            System.out.println(ngeList.get(i));
        }
    }
}
