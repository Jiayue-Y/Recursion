import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TextWiseTest {

    @Test
    void reverseTest() {
        String t1 = "h";
        String t2 = ";";
        String t3 = "h!";
        String t4 = "!!!!";
        String t5 = "h3 ll o";
        String t6 = "h3llo!";

        assertEquals(t1, TextWise.reverse(t1));
        assertEquals(t2, TextWise.reverse(t2));
        assertEquals("!h", TextWise.reverse(t3));
        assertEquals(t4, TextWise.reverse(t4));
        assertEquals("o ll 3h", TextWise.reverse(t5));
        assertEquals("!oll3h", TextWise.reverse(t6));
    }
}