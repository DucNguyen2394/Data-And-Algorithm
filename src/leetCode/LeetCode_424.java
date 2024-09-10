package leetCode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode_424 {

	public static int characterReplacement(String s, int k) {
		int result = 1;
		int max = 0,l = 0, r = 0;
		Map<Character, Integer> map = new HashMap<>();
		while(r < s.length()) {
			int curr_len = r - l + 1;
			map.put(s.charAt(r), map.getOrDefault(s.charAt(r), 0) + 1);
			max = Math.max(max, map.get(s.charAt(r)));
			if(curr_len - max <= k) {
				result = Math.max(result, curr_len);
				r++;
			}
			else {
				map.put(s.charAt(r), map.get(s.charAt(r)) - 1);
				map.put(s.charAt(l), map.get(s.charAt(l)) - 1);
				l++;
			}
		}
		System.out.println(result);
		return result;
    }
}
