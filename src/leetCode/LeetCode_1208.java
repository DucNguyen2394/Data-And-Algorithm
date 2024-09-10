package leetCode;

import java.util.Arrays;

public class LeetCode_1208 {
	
	public static int equalSubstring(String s, String t, int maxCost) {        
        int result = 0;
        int n = s.length();
        int cost = 0;
        int l = 0,r = 0;
        while(r < n) {
        	if(cost <= maxCost) {
        		cost += Math.abs(s.charAt(r) - t.charAt(r));
        		r++;
        	}
        	while(cost > maxCost) {
        		cost -= Math.abs(s.charAt(l) - t.charAt(l));
        		l++;
        	}
        }
        System.out.println(result);
		return result;
    }
	
	public static void main(String[] args) {
		equalSubstring("pxezlaaaaaaaa", "loewbiaaaaaaa", 25);
	}
}
