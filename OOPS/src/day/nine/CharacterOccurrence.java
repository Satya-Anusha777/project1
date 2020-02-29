package day.nine;

import java.util.HashMap;
import java.util.Scanner;

public class CharacterOccurrence {
	public static HashMap getCharacterOccurrence(String str) {
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string ");
		String str  = sc.next();
		HashMap hm = getCharacterOccurrence(str);
		System.out.println(hm);
	}
}