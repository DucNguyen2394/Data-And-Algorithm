package myHashTable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MyHashSet {

	private final int SIZE = 1000;
	private ArrayList<Integer> myBucket[];
	
	public MyHashSet() {
		myBucket = new ArrayList[SIZE];
		for(int i = 0; i < myBucket.length; i++) {
			myBucket[i] = new ArrayList<Integer>();
		}
	}
	
	private int hashFunction(int key) {
		return key % SIZE;
	}
	
	public void add(int key) {
		int hashValueIndex = hashFunction(key);
		ArrayList<Integer> bucket = myBucket[hashValueIndex];
	}
	
	public boolean containsDuplicate(int[] nums) {
		Set<Integer> mySet = new HashSet<>();
		
		for(int n : nums) {
			if(mySet.contains(n) == true) {
				return true;
			}else {
				mySet.add(n);
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		
	}
}
