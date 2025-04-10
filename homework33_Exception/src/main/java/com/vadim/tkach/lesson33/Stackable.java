package com.vadim.tkach.lesson33;

public interface Stackable {
    void addElementToStack(int element) throws StackIsFullException;

    int deleteElementFromStack() throws StackIsEmptyException;

    int readTop();

    boolean isEmpty();

    boolean isFull();
}
