package chapter01;

public class Sample08 {
	public static void main(String[] args) {
		int a = 65;
		byte b = (byte) a; // 정수를 byte로 명시적 형 변환
		System.out.println(b);
		
		b = (byte) (a + 1);
		System.out.println(b);
		
		a = b;
		System.out.println(a);
		
		b = (byte)a;
		System.out.println(b);
	}
}
