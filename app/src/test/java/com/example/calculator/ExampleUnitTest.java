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
        assertEquals("Right!!!!","144",tools.evaluation("12*12"));
        assertEquals("Right!!!!","150",tools.evaluation("12*12+6"));
        assertEquals("Right!!!!","146",tools.evaluation("12*12+6-4"));
    }

    @Test
    public void expressinfIscorrect2(){
        Tools tools = new Tools();
        assertEquals("Right!!!!","140",tools.evaluation("12*12"));
        assertEquals("Right!!!!","155",tools.evaluation("12*12+6"));
        assertEquals("Right!!!!","145",tools.evaluation("12*12+6-4"));
    }
}