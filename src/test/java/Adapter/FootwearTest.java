package Adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FootwearTest {

    // 7, 7.5, 8.5, 9

    @Test
    void shouldReturnSizeUsa() {
        Footwear footwear = new Footwear();
        footwear.setSize(7);

        assertEquals(7, footwear.getSize());
    }

    @Test
    void shouldReturnSizeBr() {
        Footwear footwear = new Footwear();
        footwear.setSize(7);

        assertEquals(36, footwear.getSizeBr());
    }
}
