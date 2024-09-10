package leetCode;

import java.util.Arrays;

public class LeetCode_2022 {

	public static int[][] construct2DArray(int[] original, int m, int n) {
		 int[][] result = new int[m][n];
	        if(original.length < n || original.length < m) {
	        	return new int[0][0];
	        }
	         int k = 0;
	        for(int i = 0; i < m; i++) {
	        	for(int j = 0; j < n; j++) {
	        		if(k < original.length) {
	        		    result[i][j] = original[k];
	        		}
	        		k++;
	        	}
	        }
	        if(original.length != k){
	            return new int[0][0];
	        }
			return result;
    }
	
	public static void main(String[] args) {
		int[] original = {6,2,6,8};
		construct2DArray(original,4,2);
	}
}
