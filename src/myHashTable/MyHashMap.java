package myHashTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MyHashMap {

	private static final int SIZE = 1000;
	
	private class Data{
		int key;
		int value;
		Data(int key, int value){
			this.key = key;
			this.value = value;
		}
		@Override
		public boolean equals(Object obj) {
			if(obj instanceof Data) {
				return this.key == ((Data)obj).key;
			}
			return false;
		}	
	}
	
	private ArrayList<Data> myBucket[];
	
	public MyHashMap() {
		myBucket = new ArrayList[SIZE];
		for(int i = 0; i < myBucket.length; i++) {
			myBucket[i] = new ArrayList<>();
		}
	}
	
	private int hashFunction(int key) {
		return key % SIZE;
	}
	
	public void put(int key, int value) {
		int hashValueIndex = hashFunction(key);
		ArrayList<Data> bucket = myBucket[hashValueIndex];
		Data newData = new Data(key, 0);
		int keyIndex = bucket.indexOf(newData);
		if(keyIndex >= 0) {
			bucket.get(keyIndex).value = value;
		}else {
			bucket.add(newData);
		}
	}
	
	public void remove(int key) {
		int hashValueIndex = hashFunction(key);
		
	}
	
	public int get(int key) {
		
		return 0;
	}
	
	public static void main(String[] args) {
		Map<Integer, Integer> myMap = new HashMap<>();
		int[] arr = {1,2,3,1,1,2,3};
		for(int i : arr) {
			if(myMap.containsKey(i) == false) {
				myMap.put(i, 1);
			}else {
				int count = myMap.get(i);
				count++;
				myMap.put(i, count);
			}
		}
		for(Map.Entry entry : myMap.entrySet()) {
			System.out.println(entry.getKey() + " xuat hien " + entry.getValue() + " lan!");
		}
	}
}
