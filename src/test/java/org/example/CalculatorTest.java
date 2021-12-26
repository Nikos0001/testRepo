package org.example;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    public void testSum(){
        int a = 2;
        int b = 3;
        int sumExpectedResult = 5;

        int sumActualResult = Calculator.sum(a,b);
        assertEquals(sumExpectedResult,sumActualResult);
    }

}