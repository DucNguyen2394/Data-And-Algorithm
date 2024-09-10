package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UnitTest {
	
	public static boolean containsDuplicate(int[] nums) {
		Set<Integer> set = new HashSet<>();
		for(int n : nums) {
			if (set.contains(n)) {
				return false;
			}
			set.add(n);
		}
		return true;
	}

	public static void main(String[] args) {
		int[] nums = {1,2,3,1};
		
		containsDuplicate(nums);
	}
}
