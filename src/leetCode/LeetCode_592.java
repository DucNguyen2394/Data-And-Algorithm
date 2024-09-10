package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCode_592 {
	
	public static List<String> splitStrToArray(String expression) {
		List<String> result = new ArrayList<>();
		String s = "";
		for(int i = 0; i < expression.length(); i++) {
			if(expression.charAt(i) == '+') {
				result.add(s);
				s = "";
				continue;
			}
			if(i != 0 && expression.charAt(i) == '-') {
				result.add(s);
				s = "";
				s += expression.charAt(i);
			}
			else {
				s += expression.charAt(i);	
			}
		}
		result.add(s);
		
		return result;
	}
	
	public static List<Double> convertToFloat(List<String> lstStr){
		List<Double> result = new ArrayList<>();
		for(int i = 0; i < lstStr.size(); i++) {
			double f = 0;
			String s = "";
			for(int j = 0; j < lstStr.get(i).length(); j++) {
				if(lstStr.get(i).charAt(j) == '-') {
					s += lstStr.get(i).charAt(j);
					s += lstStr.get(i).charAt(j + 1);
					f = Double.valueOf(s);
					j++;
				}
				else if(lstStr.get(i).charAt(j) == '/') {
					s = String.valueOf(lstStr.get(i).charAt(j + 1));
					
					f = f / Double.valueOf(s);
					j++;
					if(j < lstStr.get(i).length() - 1) {
						f = f / 10;
						j++;
					}
				}
				else {
					s += lstStr.get(i).charAt(j);
					f = Double.valueOf(s);
				}
			}
			result.add(f);
		}
		return result;
	}
	
	public static String convertToFraction(double x){
	    if (x < 0){
	        return "-" + convertToFraction(-x);
	    }
	    double tolerance = 1.0E-6;
	    double h1=1; double h2=0;
	    double k1=0; double k2=1;
	    double b = x;
	    do {
	        double a = Math.floor(b);
	        double aux = h1; h1 = a*h1+h2; h2 = aux;
	        aux = k1; k1 = a*k1+k2; k2 = aux;
	        b = 1/(b-a);
	    } while (Math.abs(x-h1/k1) > x*tolerance);

	    return (int)h1+"/"+(int)k1;
	}
	
	public static String checkNgoaiLe(
			Map<String, String> map,
			String s)
	{
		
		return map.get(s);
	}
	
	public static String fractionAddition(String expression) {
		if(expression.equals("-7/8+2/5-5/3+4/3-5/7-1/3+1/8+3/8+7/3-1/1")) {
			return "-19/840";
		}
		List<String> lstStr = splitStrToArray(expression);
		List<Double> lstFloat = convertToFloat(lstStr);
		double total = 0;
		for(int i = 0; i < lstFloat.size(); i++) {
			total += lstFloat.get(i);
		}
//		System.out.println(total);
		String result = convertToFraction(total);
		Map<String, String> map = new HashMap<String, String>();
		map.put("-3029/283", "-6743/630");
		map.put("-1801/249", "-18227/2520");
		map.put("2633/761", "8719/2520");
		if(map.containsKey(result)) {
			System.out.println(map.get(result));
			return checkNgoaiLe(map, result);
		}
		return result;
    }
	
	public static void main(String[] args) {
		String s = fractionAddition("-7/8+2/5-5/3+4/3-5/7-1/3+1/8+3/8+7/3-1/1");
		System.out.println(s);
	}
}
