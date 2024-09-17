package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class UnitTest {
	
	 public static int findTheLongestSubstring(String s) {
		 int result = 0;
		 Map<Character, Integer> map = new HashMap<Character, Integer>();
		 map.put('a', 0);
		 map.put('e', 0);
		 map.put('i', 0);
		 map.put('o', 0);
		 map.put('u', 0);
		 for(int i = 0; i < s.length(); i++) {
			 if(map.containsKey(s.charAt(i))) {
				 map.put(s.charAt(i), map.getOrDefault(s.charAt(i), map.get(s.charAt(i))) + 1);
			 }
		 }
		 System.out.println('a' - 'e' );
		 System.out.println(map);
		 return result;
	 }

	public static void main(String[] args) {
		int[] nums = {};
		findTheLongestSubstring("eleetminicoworoep");
	}
}
