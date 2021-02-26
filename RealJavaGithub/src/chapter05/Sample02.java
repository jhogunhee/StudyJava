package chapter05;

public class Sample02 {
	public static void main(String[] args) {
		int[] numbers = new int[3];
		
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		
		System.out.printf("배열의 개수는 %d개입니다.\n", numbers.length);
		
		int[] number2 = {10, 20, 30};
		System.out.printf("배열의 개수는 %d개입니다.", number2.length);
	}
}
