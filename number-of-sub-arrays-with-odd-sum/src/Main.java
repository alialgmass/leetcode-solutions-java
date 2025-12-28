//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
Solution solution = new Solution();
long count = solution.numOfSubarrays(new int[]{1,2,3,4,5,6,7});
System.out.println("Number of Sub-arrays with Odd Sum: " + count);
}
