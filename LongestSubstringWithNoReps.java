import java.util.*;

class LongestSubstringWithNoReps {
    
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> hash = new HashMap<>();
        int count = 0;
        int currCount = 0;
        
        for (int i = 0; i < s.length(); ++i) {
           if (hash.containsKey(s.charAt(i))) {
               if (currCount > count) count = currCount;
               i = hash.get(s.charAt(i)) + 1;
               hash.clear();
               hash.put(s.charAt(i), i);
               currCount = 1;
           } 
           else {
              hash.put(s.charAt(i), i);
              ++currCount;
           }
        }
        if (currCount > count) return currCount;
        return count;
    }
}