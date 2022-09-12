/*
 * This file contains JUnit test cases for IntroLab.java
 *
 * Complete the TODO in this file!
 */

import org.junit.*;

import static org.junit.Assert.*;

public class IntroLabTest {
    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test(timeout = 10)
    public void testExampleStudent() {
        String expected = "Hello! My name is Stu Dent! " +
                "I like cats more than dogs! Welcome to CSC207!";
        String actual = IntroLab.exampleStudent();
        assertEquals(expected, actual);
    }
    
    
    @Test(timeout = 100)
    public void testZhujieru() {
        String expected = "Hello! My name is Jerry! I like cats more than dogs! ";
        String actual = IntroLab.zhujieru();
        assertEquals(expected, actual);
    }
    
    @Test(timeout = 100)
    public void testStudent(){
        String expected = "! My name is Peter! I like cats more than dogs! ";
        String actual = IntroLab.linpete3();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGuiyijie() {
        String expected = "Meow! My name is Azalea! " +
            "I like cats more than dogs! >_<";
        String actual = IntroLab.guiyijie();
        assertEquals(expected, actual);
    }
}
