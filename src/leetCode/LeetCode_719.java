package leetCode;

import java.util.Arrays;

public class LeetCode_719 {

	public static int smallestDistancePair(int[] nums, int k) {	
		int[] arrDistance = new int[100];
		
		for(int i = 0 ; i < nums.length; i++) {
			for(int j = i + 1; j < nums.length; j++) {
				int distance = Math.abs(nums[i] - nums[j]);
				arrDistance[distance] += 1;
			}
		}
		System.out.println(Arrays.toString(arrDistance));
		for(int distance = 0; distance < arrDistance.length; distance++) {
			k -= arrDistance[distance];
			if(k <= 0) {
				System.out.println(distance);
				return distance;
			}
		}
		return -1;
    }
	
	public static void main(String[] args) {
		int[] nums = {1,5,1,2,3,2};
		smallestDistancePair(nums,3);
	}
}
