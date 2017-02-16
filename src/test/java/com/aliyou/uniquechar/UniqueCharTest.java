package com.aliyou.uniquechar;

import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

/**
 * Created by aliyou on 12/02/17.
 */



public class UniqueCharTest {
    UniqueChar uniqueChar = new UniqueChar();

    @Test
    public void uniqueCharOrNotTest() {
        String result = uniqueChar.uniqueCharOrNot("abcdefg");
        String result1 = uniqueChar.uniqueCharOrNot("abcdafg");

        assertEquals("ok", result);
        assertEquals("ko", result1);
    }

}
