public class PathCoverageTest {

    private final test app = new test();

    public static void main(String[] args) {
        PathCoverageTest testRunner = new PathCoverageTest();

        testRunner.testPath1_NullArray();
        testRunner.testPath2_EmptyArray();
        testRunner.testPath3_OnlyOddNumbers();
        testRunner.testPath4_ContainsEvenNumbers();

        System.out.println("--> PASSED: Tat ca test case Path Coverage!");
    }

    // Path 1
    void testPath1_NullArray() {
        if (app.sumEvenNumbers(null) != 0) {
            throw new AssertionError("Path 1 Failed: Expected 0 for null array");
        }
    }

    // Path 2
    void testPath2_EmptyArray() {
        if (app.sumEvenNumbers(new int[] {}) != 0) {
            throw new AssertionError("Path 2 Failed: Expected 0 for empty array");
        }
    }

    // Path 3
    void testPath3_OnlyOddNumbers() {
        int[] input = { 1, 3, 5 };
        if (app.sumEvenNumbers(input) != 0) {
            throw new AssertionError("Path 3 Failed: Expected 0 for odd-only array");
        }
    }

    // Path 4
    void testPath4_ContainsEvenNumbers() {
        int[] input = { 2, 4 };
        if (app.sumEvenNumbers(input) != 6) {
            throw new AssertionError("Path 4 Failed: Expected 6 for array with even numbers");
        }
    }
}