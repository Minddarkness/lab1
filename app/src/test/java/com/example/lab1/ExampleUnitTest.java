package com.example.lab1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void test_max_1()
    {
        MainActivity mainActivity = new MainActivity();
        int expected = 1;
        assertEquals(expected, mainActivity.max(1,1));
    }

    @Test
    public void test_max_2()
    {
        MainActivity mainActivity = new MainActivity();
        int expected = 2;
        assertEquals(expected, mainActivity.max(2,1));
    }

    @Test
    public void test_max_3()
    {
        MainActivity mainActivity = new MainActivity();
        int expected = 2;
        assertEquals(expected, mainActivity.max(1,2));
    }

    @Test
    public void test_max_4()
    {
        MainActivity mainActivity = new MainActivity();
        int expected = -3;
        assertEquals(expected, mainActivity.max(-3,-9));
    }


    @Test
    public void test_min_1()
    {
        MainActivity mainActivity = new MainActivity();
        int expected = 1;
        assertEquals(expected, mainActivity.min(1,1));
    }

    @Test
    public void test_min_2()
    {
        MainActivity mainActivity = new MainActivity();
        int expected = 1;
        assertEquals(expected, mainActivity.min(2,1));
    }

    @Test
    public void test_min_3()
    {
        MainActivity mainActivity = new MainActivity();
        int expected = 1;
        assertEquals(expected, mainActivity.min(1,2));
    }

    @Test
    public void test_min_4()
    {
        MainActivity mainActivity = new MainActivity();
        int expected = -9;
        assertEquals(expected, mainActivity.min(-3,-9));
    }
}