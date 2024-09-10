package leetCode;

public class LeetCode_860 {
	
	public static boolean lemonadeChange(int[] bills) {
		int ten = 0;
		int five = 0;
		
		for(int n : bills) {
			if(n == 5) {
				five++;
			}
			else if(n == 10) {
				if(five > 0) {
					five--;
					ten++;
				}
				else {
					return false;
				}
			}
			else {
				if(ten > 0 && five > 0) {
					ten--;
					five--;
				}
				else if(ten <= 0 && five > 2) {
					five-=3;
				}
				else{
					return false;
				}
			}
		}
        
        return true;
    }
	
	public static void main(String[] args) {
		int[] bills = {5,5,5,10,5,5,10,20,20,20};
		System.out.println(lemonadeChange(bills));
	}
}
