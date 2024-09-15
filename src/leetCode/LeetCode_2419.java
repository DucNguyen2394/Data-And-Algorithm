package leetCode;

public class LeetCode_2419 {

	public static int longestSubarray(int[] nums) {      
		int result = 0,count = 0;
		int max = 0;
		for(int n : nums) {
			max = Math.max(n, max);
		}
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] == max) {
				count++;
			}else {
				count = 0;
			}
			result = Math.max(result, count);
		}
		System.out.println(result);
		return result;
    }
}
