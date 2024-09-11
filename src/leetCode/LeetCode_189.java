package leetCode;

import java.util.Arrays;

public class LeetCode_189 {
	
//	public static void rotate(int[] nums, int k) {
//        int n = nums.length;
//		for(int i = 0; i < k; i++) {
//			int[] numsCp = new int[n];
//			 numsCp[0] = nums[n - 1];
//			for(int j = 1; j < n; j++) {
//				numsCp[j] = nums[j - 1];
//			}
//			nums = numsCp;
//		}
//		for(int i = 0; i < n ;i++) {
//			nums[i] = nums[i];
//		}
//		System.out.println(Arrays.toString(nums));
//    }
	
	public static void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] numsCp = new int[n];
		for(int i = 0; i < n ; i ++) {
			int new_idx = (i + k) % n;
			numsCp[new_idx] = nums[i];
		}
		for(int i = 0; i < n ; i ++) {
			nums[i] = numsCp[i];
		}
    }
	
	public static void main(String[] args) {
		int nums[] = {1,2,3,4,5,6,7};
		rotate(nums,3);
	}
}
