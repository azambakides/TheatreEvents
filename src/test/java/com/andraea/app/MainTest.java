package com.andraea.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainTest {
    @Test
    public void test_Show_Found_If_Exists() {
        boolean showExists = Main.foundSelectedShow("Cats");
        assertTrue(showExists);
    }
    @Test
    public void test_Show_Not_Found_If_Does_Not_Exist() {
        boolean showDoesNotExist = Main.foundSelectedShow("High School Musical");
        assertFalse(showDoesNotExist);
    }
}