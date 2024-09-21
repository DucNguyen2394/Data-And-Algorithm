package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode_386 {
	
	public static List<Integer> lexicalOrder(int n) {
        List<Integer> result = new ArrayList<Integer>();
        int current = 1;
        while(result.size() < n) {
        	result.add(current);        		
        	if(current * 10 <= n ) {
        		current *= 10;
        	}
        	else {
        		while(current >= n || current % 10 == 9) {
        			current /= 10;
        		}
        		current++;
        	}
        }
        System.out.println(19 % 10);
        System.out.println(Arrays.toString(result.toArray()));
        return result;
    }
}
