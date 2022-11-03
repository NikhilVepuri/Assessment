package org.example;

import org.example.controllers.CheckUniqueness;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;

public class CheckUniquenessTest {
    @Test
    public void testAbbreviate() {
        //Test case #1:
        String[] words1 = new String[]{"internationalization","localization","accessibility","automatically","accessibilimy","a"};
        CheckUniqueness checkUniquenesstest1 = new CheckUniqueness(words1);
        String inputWord1= "internationalization";


        assertEquals("i18n", checkUniquenesstest1.abbreviate(inputWord1));


        //Test case #2:
        String[] words2 = new String[]{"internationalization","localization","accessibility","automatically","accessibilimy","a"};
        CheckUniqueness checkUniquenesstest2 = new CheckUniqueness(words2);
        String inputWord2= "a";


        assertEquals("Cannot abbreviate when the length of word is less than 2",checkUniquenesstest2.abbreviate(inputWord2));


    }


    @Test
    public void testIsUnique() {
        //Test case #1:
        String[] words1 = new String[]{"internationalization","localization","accessibility","automatically","accessibilimy","a"};
        CheckUniqueness obj1 = new CheckUniqueness(words1);

        assertFalse(obj1.isUnique("accessibility"));

        assertTrue(obj1.isUnique("internationalization"));


    }
}
