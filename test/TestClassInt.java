
import zunit.TestSuiteInt;

public class TestClassInt extends TestSuiteInt {

    @Override
    public void testMethodList() {
        passingTestInt();
        failingTestInt();
    }

    @Override
    protected void runTestSuiteInt() {

    }

    public static void main(String[] args) {
        TestClassInt testClassInt = new TestClassInt();
        testClassInt.runTestSuiteInt();
    }
    private void passingTestInt(){
        assertEquals(5,5);
    }
    private void failingTestInt(){ assertEquals(5,3); }
}
