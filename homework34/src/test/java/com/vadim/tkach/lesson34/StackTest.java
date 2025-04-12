package com.vadim.tkach.lesson34;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StackTest {

    @Test
    void shouldReadTopWhenStackNotEmptyReturnsTopElement() throws StackIsFullException {
        Stack stack = new Stack(3);
        stack.addElementToStack(10);
        stack.addElementToStack(20);

        Optional<Integer> result = stack.tryReadTop();

        assertTrue(result.isPresent(), "Expected non-empty Optional");
        assertEquals(20, result.get(), "Top element should be 20");
    }

    @Test
    void shouldReadTopWhenStackIsEmptyReturnsEmptyOptional() {
        Stack stack = new Stack(2);

        Optional<Integer> result = stack.tryReadTop();

        assertTrue(result.isEmpty(), "Expected empty Optional");
    }
}
