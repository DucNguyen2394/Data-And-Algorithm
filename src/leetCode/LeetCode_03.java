package leetCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LeetCode_03 {

	public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<Character>();
        int i = 0;
        int j = 0;
        String str = "";
        int result = 0;
        while(i < s.length()) {
        	if(set.contains(s.charAt(i))) {
        		set.remove(s.charAt(j));
        		j++;
        		continue;
        	}
        	set.add(s.charAt(i));
        	System.out.println(Arrays.toString(set.toArray()));
        	result = Math.max(result, set.size());
        	i++;
        }
		System.out.println(result);
		return result;
    }
	
	public static void main(String[] args) {
		lengthOfLongestSubstring("qrsvbspk");
	}
}
