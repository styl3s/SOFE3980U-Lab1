package com.ontariotechu.sofe3980U;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

/**
 * Additional test cases for the Design part: OR, AND, and Multiply.
 */
public class BinaryDesignTest {

    // ---------- OR ----------
    @Test
    public void testOrBasic() {
        Binary a = new Binary("1010");
        Binary b = new Binary("0110");
        assertTrue(Binary.or(a, b).getValue().equals("1110"));
    }

    @Test
    public void testOrWithZero() {
        Binary a = new Binary("0");
        Binary b = new Binary("0");
        assertTrue(Binary.or(a, b).getValue().equals("0"));
    }

    @Test
    public void testOrDifferentLengths() {
        Binary a = new Binary("101");
        Binary b = new Binary("10");
        assertTrue(Binary.or(a, b).getValue().equals("111"));
    }

    // ---------- AND ----------
    @Test
    public void testAndBasic() {
        Binary a = new Binary("1010");
        Binary b = new Binary("0110");
        assertTrue(Binary.and(a, b).getValue().equals("10"));
    }

    @Test
    public void testAndAllOnes() {
        Binary a = new Binary("1111");
        Binary b = new Binary("1111");
        assertTrue(Binary.and(a, b).getValue().equals("1111"));
    }

    @Test
    public void testAndWithZero() {
        Binary a = new Binary("1010");
        Binary b = new Binary("0");
        assertTrue(Binary.and(a, b).getValue().equals("0"));
    }

    // ---------- MULTIPLY ----------
    @Test
    public void testMultiplyBasic() {
        Binary a = new Binary("101"); // 5
        Binary b = new Binary("11");  // 3
        assertTrue(Binary.multiply(a, b).getValue().equals("1111")); // 15
    }

    @Test
    public void testMultiplyByZero() {
        Binary a = new Binary("0");
        Binary b = new Binary("1010");
        assertTrue(Binary.multiply(a, b).getValue().equals("0"));
    }

    @Test
    public void testMultiplyOtherByZero() {
        Binary a = new Binary("111");
        Binary b = new Binary("0");
        assertTrue(Binary.multiply(a, b).getValue().equals("0"));
    }
}