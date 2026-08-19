public class StatementCoverageTest {

    private final test app = new test();

    public static void main(String[] args) {
        StatementCoverageTest testRunner = new StatementCoverageTest();

        testRunner.testStatementCoverage_NullInput();
        testRunner.testStatementCoverage_WithEvenAndOddNumbers();

        System.out.println("--> PASSED: Tat ca test case Statement Coverage!");
    }

    void testStatementCoverage_NullInput() {
        if (app.sumEvenNumbers(null) != 0) {
            throw new AssertionError("Expected 0 for null input");
        }
    }

    void testStatementCoverage_WithEvenAndOddNumbers() {
        int[] input = { 1, 2, 3, 4 };
        if (app.sumEvenNumbers(input) != 6) {
            throw new AssertionError("Expected 6 for mixed input");
        }
    }
}