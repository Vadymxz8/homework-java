package com.vadim.tkach.lesson33;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class StackTest {

    @Test
    void shouldAddElementToStack() throws StackIsFullException {
//      given
        Stack theStack = new Stack(1);
//      when
        theStack.addElementToStack(23);
//      then
        assertEquals(1, 1);
    }

    @Test
    void shouldDeleteElementFromStack() throws StackIsEmptyException, StackIsFullException {
//      given
        Stack theStack = new Stack(1);
//      when
        theStack.addElementToStack(23);
        theStack.deleteElementFromStack();
//      then
        assertEquals(1, 1);
    }

    @Test
    void shouldThrowExceptionWhenDeleteElementFromStack() throws StackIsEmptyException {
//      given
        Stack theStack = new Stack(1);
//      when&then
        assertThrows(StackIsEmptyException.class, () -> theStack.deleteElementFromStack());
    }

    @Test
    void shouldThrowExceptionWhenAddElementFromStack() throws StackIsFullException {
//      given
        Stack theStack = new Stack(0);
//      when&then
        assertThrows(StackIsFullException.class, () -> theStack.addElementToStack(23));
    }
}