package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LeetCode_40 {

	public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
		Set<List<Integer>> set = new HashSet<List<Integer>>();
		Arrays.sort(candidates);
		System.out.println(Arrays.toString(candidates));
		List<Integer> lst = new ArrayList<>();
		backtrack(0, candidates, target, set, lst);
		List<List<Integer>> results = new ArrayList<List<Integer>>();
		results.addAll(set);
		return results;
    }
	
	public static void backtrack(
			int start,
			int[] candidates,
			int target,
			Set<List<Integer>> results,
			List<Integer> lst) 
	{
		if(target == 0) {
			results.add(new ArrayList<>(lst));
			return;
		}
		for(int i = start; i < candidates.length; i++) {
			if(candidates[i] > target) break;
			lst.add(candidates[i]);
			backtrack(i + 1, candidates, target - candidates[i], results, lst);
			lst.remove(lst.size() - 1);
		}
	}
	
	public static void main(String[] args) {
		//[1, 1, 2, 5, 6, 7, 10]
		int[] candidates = {10,1,2,7,6,1,5};
		combinationSum2(candidates,8);
	}
	
}
