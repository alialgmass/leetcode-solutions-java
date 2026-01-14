import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Case 1: Basic case
        List<List<Integer>> case1 = List.of(
                List.of(1, 2),
                List.of(4, 5)
        );
        runTest(solution, case1, 4);

        // Case 2: Min and max in same array (important)
        List<List<Integer>> case2 = List.of(
                List.of(1, 100),
                List.of(2, 3)
        );
        runTest(solution, case2, 98);

        // Case 3: Negative numbers
        List<List<Integer>> case3 = List.of(
                List.of(-10, -5),
                List.of(1, 7),
                List.of(3, 6)
        );
        runTest(solution, case3, 17);

        // Case 4: Multiple arrays
        List<List<Integer>> case4 = List.of(
                List.of(1, 4),
                List.of(0, 5),
                List.of(2, 3)
        );
        runTest(solution, case4, 4);

        // Case 5: Edge-ish but valid
        List<List<Integer>> case5 = List.of(
                List.of(1, 1),
                List.of(1, 1)
        );
        runTest(solution, case5, 0);
    }

    private static void runTest(Solution solution, List<List<Integer>> input, int expected) {
        int result = solution.maxDistance(input);
        System.out.println(
                "Result: " + result +
                        " | Expected: " + expected +
                        " | " + (result == expected ? "PASS" : "FAIL")
        );
    }
}
