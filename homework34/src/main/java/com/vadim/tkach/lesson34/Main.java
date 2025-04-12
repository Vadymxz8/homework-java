package com.vadim.tkach.lesson34;


import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Stack theStack = new Stack(2);


        Optional<Integer> topElement = theStack.tryReadTop();
        topElement.ifPresentOrElse(
                value -> System.out.println("Top element is: " + value),
                () -> System.out.println("Stack is empty — no top element.")
        );
    }
}
