package leetCode;
import java.util.Arrays;

public class LeetCode_664 {
	
	public static int strangePrinter(String s) {
        int result = 0;
        int n = s.length();
        int[][] minMatrix = new int[n][n];
        for(int i = n - 1; i >= 0 ; i--) {
        	minMatrix[i][i] = 1;
        	for(int j = i + 1; j < n; j++) {
        		System.out.println(minMatrix[i][j - 1]);
        		if(s.charAt(i) == s.charAt(j)) {
        			minMatrix[i][j] = minMatrix[i][j - 1];
        		}
        		else {
        			minMatrix[i][j] = Integer.MAX_VALUE;
        			
        		}
        	}
        }
        
		return result;
    }
	
	public static void main(String[] args) {
		strangePrinter("aaabbb");
	}
}
