package leetCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LeetCode_1684 {
	
//	public static int countConsistentStrings(String allowed, String[] words) {
//        int result = 0;
//        for(int i = 0; i < words.length; i++) {
//        	boolean check = false;
//        	for(int j = 0; j < words[i].length(); j++) {
//        		check = false;
//        		for(int k = 0; k < allowed.length(); k++) {
//        			if(words[i].charAt(j) == allowed.charAt(k)) {
//        				check = true;
//        				break;
//        			}
//        		}
//        		if(!check) {
//        			break;
//        		}
//        	}
//        	if(check) {
//        		result++;
//        	}
//        }
//        System.out.println(result);
//        return result;
//    }
	
	public static int countConsistentStrings(String allowed, String[] words) {
		int result = 0;
		Set<Character> set = new HashSet<Character>();
		for(char c : allowed.toCharArray()) {
			set.add(c);
		}
		for(int i = 0; i < words.length; i++) {
			boolean check = true;
			for(int j = 0; j < words[i].length(); j++) {
				if(set.contains(words[i].charAt(j))) {
					check = false;
					break;
				}
			}
			if(check) {
				result++;
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		String[] words = {"ad","bd","aaab","baa","badab"};
		countConsistentStrings("ab" , words);
	}
}
