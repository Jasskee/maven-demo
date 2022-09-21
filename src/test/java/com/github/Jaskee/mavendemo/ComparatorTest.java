package com.github.Jaskee.mavendemo;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Unit-level testing for Comparator")
public class ComparatorTest {
    private final Comparator comparator = new Comparator();

    @Test
    public void shouldConfirmNumbersAreEqual() {
        boolean sameNumbers = comparator.areNumbersEqual(2, 2);

        Assertions.assertTrue(sameNumbers);
    }

    @Test
    public void shouldConfirmNumbersAreNotEqual(){
        boolean differentNumbers = comparator.areNumbersEqual(5,50);

        Assertions.assertFalse(differentNumbers);
    }
}