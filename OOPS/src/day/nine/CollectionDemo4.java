package day.nine;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class CollectionDemo4 {
	public static void main(String[] args) {
		ArrayList <String> arrayList = new ArrayList<String>();
		arrayList.add("INDIA");
		arrayList.add("AUSTRALIA");
		arrayList.add("BANGLADESH");
		arrayList.add("CHINA");
		arrayList.add("DUBAI");
		arrayList.add("FRANCE");
		arrayList.add("INDIA");
		System.out.println(arrayList);
		for(String str : arrayList) {
			System.out.println(str);
		}
		Iterator it = arrayList.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}