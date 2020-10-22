import zunit.TestSuite;

public class TestClassWithInt extends TestSuite {

    @Override
    public void testMethodList() {
        failingTestInt();
        passingTestInt();
    }
    public static void main(String[] args) {
        TestClassInt testClassInt = new TestClassInt();
        testClassInt.runTestSuite();
    }

    private void passingTestInt(){
        // Ændres fra int til Strings
        assertEquals(5, 5);
    }

    private void failingTestInt(){
        assertEquals(5,3);

    }

    private void assertEquals(Integer expected, Integer actual) {
    }


}

