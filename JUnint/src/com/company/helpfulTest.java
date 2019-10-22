package com.company;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class helpfulTest {

    @Test
    public void testconcatenate(){
        //Set test environment
        helpful target = new helpful();
        int inputA = 3;
        int inputB = 0;
        //Expected result
        int expectedResult = 3;
        //Stimuli to the unit under test (target.sum)
        int actualResult = target.sumArray(inputA, inputB);
        //Check
        assertEquals(expectedResult, actualResult);

        }
    @Test
    public void testsum() {
        //Set test environment
        helpful target = new helpful();
        String inputA = "a";
        String inputB = "bc";
        //Expected result
        String expectedResult = "abc";
        //Stimuli to the unit under test (target.concat)
        String actualResult = target.concatenate(inputA, inputB);
        //Check
        assertEquals(expectedResult, actualResult);
    }

}
