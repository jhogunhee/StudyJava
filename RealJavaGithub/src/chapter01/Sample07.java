package chapter01;

public class Sample07 {
	public static void main(String[] args) {
		short a = 32767;  // short 최댓값
		int   b = 500000; 
		
		b = a; // 묵시적 형변환(작은 자료형 -> 큰 자료형 O)
		System.out.println(b);
	}
}
