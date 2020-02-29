package day.nine;

import java.util.HashSet;

public class CollectionDemo2 {
	public static void main(String[] args) {
		HashSet <Integer>hashSet = new HashSet<Integer>();
		hashSet.add(100);
		hashSet.add(101);
		hashSet.add(102);
		hashSet.add(103);
		hashSet.add(104);
		hashSet.add(105);
		System.out.println(hashSet);
		int sum = 0;
		//forEach loop
		for(Integer x : hashSet) {
			sum += x;
		}
		System.out.println("The sum is :" + sum);
	}
}