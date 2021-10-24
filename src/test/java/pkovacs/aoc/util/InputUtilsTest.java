package pkovacs.aoc.util;

import java.util.List;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class InputUtilsTest {

    @Test
    public void testParseIntegers() {
        String input = "I have 5 apples and 12 bananas. -42 is the opposite of 42.";
        assertArrayEquals(new int[] { 5, 12, -42, 42 }, InputUtils.parseInts(input));
        assertArrayEquals(new long[] { 5, 12, -42, 42 }, InputUtils.parseLongs(input));
    }

    @Test
    public void testScan() {
        var values = InputUtils.scan("Product PID_4242X is ordered.", ".*PID_%d%c is %s[.]");

        assertEquals(3, values.size());
        assertTrue(values.get(0).isInteger());
        assertEquals(4242, values.get(0).asInt());
        assertTrue(values.get(1).isChar());
        assertEquals('X', values.get(1).asChar());
        assertTrue(values.get(2).isString());
        assertEquals("ordered", values.get(2).get());

        assertEquals("[ParsedValue(Long: 4242), ParsedValue(Character: X), ParsedValue(String: ordered)]",
                values.toString());
    }

}
