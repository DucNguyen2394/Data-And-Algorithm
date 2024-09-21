package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class UnitTest {
	
	public static String largestNumber(int[] nums) {
		String[] numStr = new String[nums.length];
		for(int i = 0; i < nums.length; i++) {
			numStr[i] = String.valueOf(nums[i]);
		}
		Arrays.sort(numStr, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return (o2 + o1).compareTo(o1 + o2);
			}
		});		
		if(numStr[0].equals("0")) {
			return "0";
		}
        String result = "";
        for(String s : numStr) {
        	result += s;
        }
		return result;
    }
	
	

	public static void main(String[] args) {
		int[] nums = {1,10,11,12,13,2};
//		largestNumber(nums);
	}
	
}
