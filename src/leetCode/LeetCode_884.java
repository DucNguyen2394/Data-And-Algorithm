package leetCode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode_884 {
	
	public static String[] uncommonFromSentences(String s1, String s2) {
        Map<String,Integer> map = new HashMap<>();
        for(String s : s1.split(" ")) {
        	map.put(s, map.getOrDefault(s, 0) + 1);
        }
        for(String s : s2.split(" ")) {
        	map.put(s, map.getOrDefault(s, 0) + 1);
        }
        int count = 0;
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
			if(entry.getValue() == 1) {
				count++;
			}
		}
        String[] result = new String[count];
        int i = 0;
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
			if(entry.getValue() == 1) {
				result[i] = entry.getKey();
				i++;
			}
		}
		return result;
    }
	
	public static void main(String[] args) {
		uncommonFromSentences("this apple is sweet","this apple is sour");
	}
}
