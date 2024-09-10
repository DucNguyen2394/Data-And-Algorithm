package leetCode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode_930 {

//	public static int numSubarraysWithSum(int[] nums, int goal) {
//        int result = 0;
//        int sum = 0;
//        for(int i = 0; i < nums.length; i++) {
//        	sum += nums[i];
//        	if(sum == goal) {
//        		result++;
//        	}
//        	for(int j = i + 1; j < nums.length; j++) {
//        		sum += nums[j];
//        		if(sum == goal) {
//        			result++;
//        		}else if(nums[i] + nums[j] > goal) {
//        			break;
//        		}
//        	}
//        	sum = 0;
//        }
//        
//        System.out.println(result);
//        return result;
//    }
	
	public static int numSubarraysWithSum(int[] nums, int goal) {
		int result = 0;
		int sum = 0;
		Map<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < nums.length;i++) {
			sum += nums[i];
			if(sum == goal) {
				result++;
			}
			if(map.containsKey(sum - goal)) {
				System.out.println(map.get(sum - goal));
				result += map.get(sum - goal);
			}
			
			map.put(sum, map.getOrDefault(sum, 0) + 1);
			System.out.println(map);
		}
		System.out.println(result);
		return result;
	}
	
	public static void main(String[] args) {
		int[] nums = {1,0,1,0,1};
		numSubarraysWithSum(nums,2);
	}
}
