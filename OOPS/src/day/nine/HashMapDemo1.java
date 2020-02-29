package day.nine;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapDemo1 {

	public static void main(String[] args) {
		HashMap <String,Integer>hashMap = new HashMap<String,Integer>();
		hashMap.put("SACHIN", 88);
		hashMap.put("DHONI", 98);
		hashMap.put("VIRAT", 78);
		hashMap.put("KAPIL", 100);
		hashMap.put("KUMAR", 56);
		hashMap.put("RAJESH", 0);
		hashMap.put("SACHIN", 100);
		
		System.out.println(hashMap);
		System.out.println(hashMap.get("VIRAT"));
		System.out.println(hashMap.containsKey("DHONI"));
		System.out.println(hashMap.containsValue(100));
		Set set  = hashMap.keySet();
		System.out.println(set); 
		Collection values = hashMap.values();
		System.out.println(values); 
	}
}