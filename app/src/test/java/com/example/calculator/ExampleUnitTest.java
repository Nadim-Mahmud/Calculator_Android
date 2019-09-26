package com.example.calculator;

import android.util.Log;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */

public class ExampleUnitTest {
    @Test
    public void expressinfIscorrect(){
        Tools tools = new Tools();
       // assertEquals("Right!!!!","24",tools.evaluation("30-6"));
        assertEquals("Right!!!!",36,tools.add_tes(12,24));
        assertEquals("Right!!!!","13","13");
    }

    @Test
    public void expressinfIscorrect2(){
        Tools tools = new Tools();
        assertEquals("Right!!!!","24","24");
        assertEquals("Right!!!!","12","12");
        assertEquals("Right!!!!","13","13");
    }
}