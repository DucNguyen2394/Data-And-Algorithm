package leetCode;

public class LeetCode_2220 {
	
	public static int minBitFlips(int start, int goal) {
		int result = 0;
		String startStr = Integer.toBinaryString(start);
		String goalStr = Integer.toBinaryString(goal);
		if(goalStr.length() < startStr.length()) {
			int len = startStr.length() - goalStr.length();
			for(int i = 0; i < len; i++) {
				goalStr = '0' + goalStr;
			}
		}
		if(goalStr.length() > startStr.length()) {
			int len = goalStr.length() - startStr.length();
			for(int i = 0; i < len; i++) {
				startStr = '0' + startStr;
			}
		}
		System.out.println(startStr);
		System.out.println(goalStr);
		for(int i = 0; i < goalStr.length(); i++) {
			if(startStr.charAt(i) != goalStr.charAt(i)) {
				result++;
			}
		}
		System.out.println(result);
		return result;
    }
	
}
