package org.example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AppTest {

    App calculator = null;
    DummyInterface dummy = mock(DummyInterface.class);

    @Before
    public void setup() {
        calculator = new App(dummy);
    }

    @Test
    public void testFunc1() {
        when(dummy.func2(50, 50)).thenReturn(100);
        when(dummy.func2(10, 10)).thenReturn(80);
        assertEquals("func1 working",(Integer) 200, calculator.func1(50, 50));
        assertEquals("func1 working",(Integer) 100, calculator.func1(10, 10));
    }

    @Test
    public void testAdd() {
        assertEquals("addition working",(Integer) 100, calculator.add(50, 50));
    }

    @Test
    public void testSubtract() {
        assertEquals("subtraction working",(Integer) 0, calculator.sub(50, 50));
    }

    @Test
    public void testMultiply() {
        assertEquals("multiplication working",(Integer) 2500, calculator.mul(50, 50));
    }

    @Test
    public void testDivide() {
        assertEquals("division working",(Integer) 1, calculator.div(20, 20));
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        calculator.div(10, 0);
    }

    @Test(expected = NullPointerException.class)
    public void nullPointerExceptionAdd() {
        calculator.add(null, 10);
    }

    @Test(expected = NullPointerException.class)
    public void nullPointerExceptionSub() {
        calculator.sub(null, 10);
    }

    @Test(expected = NullPointerException.class)
    public void nullPointerExceptionMul() {
        calculator.mul(null, 10);
    }

    @Test(expected = NullPointerException.class)
    public void nullPointerExceptionDiv() {
        calculator.div(null, 10);
    }

    @Test(expected = NullPointerException.class)
    public void nullPointerExceptionAdd2() {
        calculator.add(10, null);
    }

    @Test(expected = NullPointerException.class)
    public void nullPointerExceptionSub2() {
        calculator.sub(10, null);
    }

    @Test(expected = NullPointerException.class)
    public void nullPointerExceptionMul2() {
        calculator.mul(10, null);
    }

    @Test(expected = NullPointerException.class)
    public void nullPointerExceptionDiv2() {
        calculator.div(10, null);
    }
}
