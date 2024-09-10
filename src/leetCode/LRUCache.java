package leetCode;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache {
	
	 HashMap<Integer, Integer> cache;
	 int capacity;
	 
	 public LRUCache(int capacity) {
		 this.capacity = capacity;
		 this.cache = new LinkedHashMap<>();
	 }
	    
	 public int get(int key) {
		 if(cache.containsKey(key)) {
			int value = cache.get(key);
			cache.remove(key);
			cache.put(key, value);
			return cache.get(key); 
		 }
		 return -1;
	 }
	    
	 public void put(int key, int value) {
		 if(cache.containsKey(key)) {
			 cache.remove(key);
		 }
		 cache.put(key, value);	
		 if(cache.size() > capacity) {
			 cache.remove(cache.keySet().toArray()[0]);
		 }
	 }
	 
	 public void print() {
		 System.out.println(cache);
	 }
	 
	 public static void main(String[] args) {
		LRUCache lruCache = new LRUCache(2);
		System.out.println(lruCache.get(2));
		lruCache.put(2, 6);
		lruCache.print();
		System.out.println(lruCache.get(1));
		lruCache.put(1, 5);
		lruCache.print();
		lruCache.put(1, 2);
		lruCache.print();
		lruCache.get(1);
		lruCache.print();
	}
}
