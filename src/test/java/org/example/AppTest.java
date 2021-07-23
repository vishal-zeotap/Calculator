package org.example;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Unit test for simple App.
 */

public class AppTest 
{

    App calculator = null;
    DummyInterface dummy = mock(DummyInterface.class);

    @Before
    public void setup(){
        calculator = new App(dummy);
    }

    @Test
    public void testFunc1()
    {
        when(dummy.func2(50,50)).thenReturn(100);
        when(dummy.func2(10,10)).thenReturn(80);
        assertEquals( 200,calculator.func1(50,50) );
        assertEquals( 100,calculator.func1(10,10) );
    }

    @Test
    public void testAdd()
    {
        assertEquals( 100,calculator.add(50,50) );
    }


    @Test
    public void testMultiply()
    {
        assertEquals( 2500,calculator.mul(50,50) );
    }


    @Test
    public void testDivide()
    {
        assertEquals( 1,calculator.div(20,20) );
    }


    @Test
    public void testSubtract()
    {
        assertEquals( 0,calculator.sub(50,50) );
    }
}
