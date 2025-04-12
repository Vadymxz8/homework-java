package com.vadim.tkach.lesson34;

import java.util.Optional;

public class Stack implements Stackable {
    private final int maxSize;
    private final int[] stackArray;
    private int top;

    public Stack(int max) {
        this.maxSize = max;
        stackArray = new int[maxSize];
        top = -1;
    }

    @Override
    public void addElementToStack(int element) throws StackIsFullException {
        if (isFull()) {
            throw new StackIsFullException();
        } else {
            stackArray[++top] = element;
            System.out.println("Element " + element + " be addet to stack");
        }
    }

    @Override
    public int deleteElementFromStack() throws StackIsEmptyException {
        if (isEmpty()) {
            throw new StackIsEmptyException("Stack is EMPTY! no head element");
        } else {
            return stackArray[top--];
        }

    }

    @Override
    public int readTop() throws StackIsEmptyException {
        if (isEmpty()) {
            throw new StackIsEmptyException("Stack is EMPTY! no head element");
        }
        return stackArray[top];
    }

    public Optional<Integer> tryReadTop() {
        if (isEmpty()) {
            return Optional.empty();
        } else {
            return Optional.of(stackArray[top]);
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
