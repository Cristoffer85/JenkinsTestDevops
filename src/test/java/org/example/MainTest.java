package org.example;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void main() {
        Main main1 = new Main();
        Main main2 = new Main();

        assertEquals(main1.add(), main2.add());
    }

    @Test
    public void add() {
        Main main = new Main();
        assertEquals(main.add(), 10);
    }
}