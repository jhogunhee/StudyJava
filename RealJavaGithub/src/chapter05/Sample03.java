package chapter05;

public class Sample03 {
	public static void main(String[] args) {
		String[] str1 = new String[3];
		str1[0] = "자바";
		str1[1] = "코틀린";
		str1[2] = "씨";
		System.out.printf("str1 배열의 개수는 %d개입니다.", str1.length);
		
		String[] str2 = {"자바", "코틀린", "씨"};
		System.out.printf("\n\nstr2 배열의 개수는 %d개입니다.", str2.length);
	}
}
