package leetCode;

public class LeetCode_214 {
	public static String shortestPalindrome(String s) {
		int n = s.length();
        String result = "";
        String reverseS = new StringBuilder(s).reverse().toString();
        for(int i = 0; i < n; i++) {
        	String currS = s.substring(0, n - i);
        	System.out.println(reverseS.substring(i));
        	if(currS.equals(reverseS)) {
        		
        	}
        }
        
        return result;
    }
	
	public static void main(String[] args) {
		System.out.println(shortestPalindrome("caaf"));
		// caaf
		// caaf
	}
}
