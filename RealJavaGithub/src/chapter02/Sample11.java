package chapter02;

import java.util.Scanner;

public class Sample11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자를 입력하세요");
		String  in = sc.nextLine();
		System.out.printf("입력한 값 : [%s]\n글자 수 : %d\n", in.toUpperCase().trim(), in.toUpperCase().trim().length());
		sc.close();
	}
}
