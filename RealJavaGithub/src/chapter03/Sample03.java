package chapter03;

/**
 * @author rjsgm
 * 
 */
public class Sample03 {
	
	/**
	 * 자료형에 대해서 학습합니다.
	 * @param args
	 */
	
	public static void main(String[] args) {
		byte a1 = -128; // byte 최솟값
		byte a2 = 127;  // byte 최댓값
		short b1 = -32768;
		short b2 = 32767;
		int c = 10000;
		long d = 10000L;
		float e = 10.1f;
		double f = 10.1;
		
		System.out.printf("byte : %d, \t short : %d\n", a1, b1);
		System.out.printf("int : %d, \t long : %d\n", c, d);
		System.out.printf("float : %f, \t double : %f", e, f);
		
	}
}
