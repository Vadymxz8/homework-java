package com.vadim.tkach.lesson30;

public class Stack implements Stackable {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public Stack(int max) {
        this.maxSize = max;
        stackArray = new int[maxSize];
        top = -1;
    }

    @Override
    public void addElementToStack(int element) {
        if (isFull()){
            System.out.println("Stack is FULL");
        }else {
            stackArray[++top] = element;
            System.out.println("Element " + element + " be addet to stack");
        }
    }

    @Override
    public int deleteElementFromStack() {
        if (isEmpty()){
            System.out.println("Stack is EMPTY");
            return -1;
        }else {
            return stackArray[top--];
        }

    }

    @Override
    public int readTop() {
        if (isEmpty()){
            System.out.println("Stack is EMPTY! no head element");
            return -1;
        }else {
            return stackArray[top];
        }
    }

    @Override
    public boolean isEmpty() {
        return (top == -1);
    }

    @Override
    public boolean isFull() {
        return (top == maxSize - 1);
    }
}
