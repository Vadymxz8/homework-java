package com.vadim.tkach.lesson34;

public interface Stackable {
    void addElementToStack(int element) throws StackIsFullException;

    int deleteElementFromStack() throws StackIsEmptyException;

    int readTop() throws StackIsEmptyException;

    boolean isEmpty();

    boolean isFull();
}
