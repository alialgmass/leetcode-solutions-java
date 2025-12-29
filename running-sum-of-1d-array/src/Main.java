//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Solution solution = new Solution();
    int[] out= solution.runningSum(new int[]{3, 1, 2, 10, 1});
    for (int num:out){
        System.out.println(num);
    }
}

