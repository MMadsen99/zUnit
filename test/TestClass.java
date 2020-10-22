/*
 *
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 22/10/2020
 *
 */

import zunit.TestSuite;

public class TestClass extends TestSuite {

    @Override
    public void testMethodList() {
        passingTest();
        failingTest();

    }

    public static void main(String[] args) {
        TestClass testClass = new TestClass();
        testClass.runTestSuite();
    }

    private void passingTest(){
        assertEquals("string1","string1");
    }
    private void failingTest(){
        assertEquals("string1","string2");
    }

    }

