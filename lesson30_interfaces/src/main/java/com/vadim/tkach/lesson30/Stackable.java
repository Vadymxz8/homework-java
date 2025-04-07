package com.vadim.tkach.lesson30;

public interface Stackable {
    void addElementToStack(int element);
    int deleteElementFromStack();
    int readTop();
    boolean isEmpty();
    boolean isFull();
}