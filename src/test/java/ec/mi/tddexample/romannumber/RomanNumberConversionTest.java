package ec.mi.tddexample.romannumber;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RomanNumberConversionTest {

    private RomanNumberConversion romanNumberConversion;

    @BeforeEach
    public void setup() {
        this.romanNumberConversion = new RomanNumberConversion();
    }

    @Test
    public void testConvert1(){
        String converted = romanNumberConversion.intToRoman(1);

        assertEquals("I", converted);
    }

    @Test
    public void testConvert2(){
        String converted = romanNumberConversion.intToRoman(2);

        assertEquals("II", converted);
    }

    @Test
    public void testConvert3(){
        String converted = romanNumberConversion.intToRoman(3);

        assertEquals("III", converted);
    }

    @Test
    public void testConvert4(){
        String converted = romanNumberConversion.intToRoman(4);

        assertEquals("IV", converted);
    }

    @Test
    public void testConvert1594(){
        String converted = romanNumberConversion.intToRoman(1594);

        assertEquals("MDXCIV", converted);
    }
}
