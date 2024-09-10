package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode_624 {

	public static int maxDistance(List<List<Integer>> arrays) {
		int min = arrays.get(0).get(0);
		int max = arrays.get(0).get(arrays.get(0).size() - 1);
        int result = 0;
        for(int i = 1; i < arrays.size(); i++) {
        	result = Math.max(result, max - arrays.get(i).get(0));
        	result = Math.max(result, arrays.get(i).get(arrays.get(i).size() - 1) - min);
        	max = Math.max(max, arrays.get(i).get(arrays.get(i).size() - 1));
        	min = Math.min(min, arrays.get(i).get(0));
        }
        
		return result;
    }
	public static void main(String[] args) {
		List<List<Integer>> arrays = new ArrayList<List<Integer>>();
		arrays.add(Arrays.asList(1,5));
		arrays.add(Arrays.asList(3,4));
		System.out.println(Arrays.toString(arrays.toArray()));
		System.out.println(maxDistance(arrays));
	}
}
