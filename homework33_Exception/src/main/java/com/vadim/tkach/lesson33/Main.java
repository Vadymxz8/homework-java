package com.vadim.tkach.lesson33;


public class Main {
    public static void main(String[] args) {
        Stack theStack = new Stack(2);

        try {
            theStack.addElementToStack(23);
            theStack.addElementToStack(99);
        } catch (StackIsFullException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Some Message");

        try {
            theStack.deleteElementFromStack();
            theStack.deleteElementFromStack();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Some Message2");

    }
}
