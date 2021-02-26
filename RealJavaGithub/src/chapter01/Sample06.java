package chapter01;

public class Sample06 {
	public static void main(String[] args) {
		int a = 32767; // short 최댓값
		short b = 40;
		
		// b = a; 묵시적 형 변환 오류 발생(큰자료형에서 작은 자료형으로 옮길떄는 명시적 형변환해야함)
		b = (short) a; // 명시적 형 변환
		System.out.println(b);
		
		int c = 32768; // short 최댓값 + 1;
		b = (short) c; // 명시적 형 변환
		System.out.println(b);
	}
}
