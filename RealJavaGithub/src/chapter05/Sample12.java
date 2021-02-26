package chapter05;

import java.util.Arrays;

public class Sample12 {
	public static void main(String[] args) {
		String[] han1 = new String[] {"라면", "미역국", "떡볶이", "수제비", "갈비탕", "순대국"};
				
		String[] han2 = Arrays.copyOf(han1, han1.length - 1);
		System.out.println(Arrays.toString(han2));
		
		String[] cp = Arrays.copyOfRange(han1, 1, han1.length -1);
		System.out.println(Arrays.toString(cp));
	}
}
