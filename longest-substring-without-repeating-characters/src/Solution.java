import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        List<Character> list = new ArrayList<Character>();
        int currentCount = 0;
        int maxCount = 0;
        char[] chars = s.toCharArray();

        for (char c : chars) {
            if (!list.contains(c)) {
                list.add(c);
                currentCount++;
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                }
            } else {
                int indexOfRepeatItem = list.indexOf(c);
                for (int i = 0; i <= indexOfRepeatItem; i++) {
                    list.removeFirst();
                    currentCount--;
                }
                list.add(c);
                currentCount++;

            }
        }
        return maxCount;
    }
}