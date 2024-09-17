package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode_539 {
	
	public static int findMinDifference(List<String> timePoints) {
        int[] minutes = new int[timePoints.size()];
        for(int i = 0; i < timePoints.size(); i++) {
        	String[] convert = timePoints.get(i).split(":");
        	int minute = Integer.valueOf(convert[0]) * 60 + Integer.valueOf(convert[1]);
        	minutes[i] = minute;
        }
        Arrays.sort(minutes);
        System.out.println(Arrays.toString(minutes));
        int result = minutes[minutes.length -1] - minutes[minutes.length - 2];
        for(int i = 1; i < minutes.length; i++) {
        	result = Math.min(result, minutes[i] - minutes[i - 1]);
        }
        if(minutes[0] == 0) {
        }
        result = Math.min(result, 1440 - minutes[minutes.length - 1] + minutes[0]);
//        int hoicham = 1440 - minutes[minutes.length - 1] + minutes[0];
//        result = Math.min(hoicham, result);
//        System.out.println(result);
        return result;
    }
	
	public static void main(String[] args) {
		List<String> timePoints = new ArrayList<String>();
		timePoints.add("05:31");
		timePoints.add("22:08");
		timePoints.add("00:35");
		System.out.println(findMinDifference(timePoints));
	}
}
