package org.example;

import org.example.controllers.ScrambleWords;
import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;
import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;

public class ScrambleWordsTest {
    ScrambleWords sw = new ScrambleWords();

    @Test
    public void testScramble() {
        int input1[] = new int[]{2};
        int[] result1 = sw.scramble(input1, 0 , input1.length-1);
        assertTrue("Should return same array if the size is less than 2", Arrays.equals(input1, result1));

        int input2[] = new int[]{2,3};
        int result2[] = sw.scramble(input2, 0, input2.length-1);
        assertTrue(Arrays.equals(input2, result2));

        int input3[] = new int[]{2,3,4,4,5,6,7,8};
        int result3[] = sw.scramble(input3, 0, input3.length-1);
        assertArrayEquals(input3, result3);
    }
}
