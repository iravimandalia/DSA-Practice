package com.dsa;

public class DynamicStack extends StackImplementation {

    public DynamicStack() {
        super();
    }

    public DynamicStack(int size) {
        super(size);
    }

    public boolean push(int item) throws StackException {
        if(isFull()) {
            int[] temp = new int[data.length * 2];

            //copy all previous data
            for(int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
        return super.push(item);
    }
}
