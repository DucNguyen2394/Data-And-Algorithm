package leetCode;

import java.util.Arrays;

public class LeetCode_2962 {
	
	public static int findMax(int[] nums) {
		int max = 0;
		for(int n : nums) {
			max = Math.max(max, n);
		}
		return max;
	}
	
//	public static long countSubarrays(int[] nums, int k) {
//        long result = 0;
//        int r = 0, l = 0,count = 0;
//        int max = findMax(nums);
//        while(r < nums.length) {
//        	if(nums[r] == max) {
//        		count++;
//        	}
//        	while(count == k) {
//        		if(nums[l] == max) {
//        			count--;
//        		}
//        		l++;
//        	}
//        	result += l;
//        	r++;
//        }
//        
//        System.out.println(result);
//		return result;
//    }
	
	public static long countSubarrays(int[] nums, int k) {
        long result = 0;
        int r = 0,l = 0,count = 0;
        int max = findMax(nums);
        while(r < nums.length) {
        	if(count == k) {
        		while(count >= k) {
        			if(nums[l] == max) {
        				count--;
        			}
        			l++;
        		}
        	}
        	else if(nums[r] == max) {
        		count++;
        		if(count >= k) {
        			continue;
        		}
        	}
        	result += l;
        	r++;
        }
        System.out.println(result);
		return result;
    }
	
	public static void main(String[] args) {
		int[] nums = {1,3,2,3,3,3,3,3,3,3,3};
		countSubarrays(nums,2);
	}
}
