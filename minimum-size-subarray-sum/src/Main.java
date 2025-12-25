//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
        Solution solution = new Solution();
        double median = solution.minSubArrayLen(7, new int[]{2,3,1,2,4,3});
        System.out.println("Minimum Size Subarray Sum: " + median);
}
