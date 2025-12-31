import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> charCountInS = new HashMap<>();
        HashMap<Character, Integer> charCountInT = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char charFromS = s.charAt(i);
            char charFromT = t.charAt(i);

            charCountInS.put(
                    charFromS,
                    charCountInS.getOrDefault(charFromS, 0) + 1
            );

            charCountInT.put(
                    charFromT,
                    charCountInT.getOrDefault(charFromT, 0) + 1
            );
        }


        for (Character key : charCountInS.keySet()) {
            if (!charCountInS.get(key).equals(charCountInT.get(key))) {
                return false;
            }
        }

        return true;
    }
}
