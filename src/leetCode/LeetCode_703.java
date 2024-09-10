package leetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeetCode_703 {
	
	public static class KthLargest{
		
		List<Integer> lst;
		int k;
		
		public KthLargest(int k, int[] nums) {
			this.k = k;
			lst = new ArrayList<>(nums.length);
			for(int n : nums) {
				lst.add(n);
			}
			Collections.sort(lst);
		}
		
		public int add(int val) {
			int index = getIndex(val);
			lst.add(index, val);
			
	        return lst.get(lst.size() - k);
	    }
		
		public int getIndex(int val) {
			int left = 0;
			int right = lst.size() - 1;
			while(left <= right) {
				int mid = (left + right) / 2;
				int midEle = lst.get(mid);
				if(midEle == val) {
					return mid;
				}
				if(midEle > val) {
					right = mid - 1; 
				}
				else if(midEle < val) {
					left = mid + 1;
				}
			}
			return left;
		}
		
	}
	public static void main(String[] args) {
		// 1,2,3,4,5,6,7,8
		
		int[] nums = {8,7,6,5,4,3,2,1};
		KthLargest test = new KthLargest(3, nums);
		test.add(0);
	}
    
}
