package Junit;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestRect {

    @Test
    public void testArea(){

        assertEquals(6,Rectangle.area(2,3));

    }
}
