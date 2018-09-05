package skoh5.prog.lv1;

import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * 직사각형 별찍기
 * https://programmers.co.kr/learn/courses/30/lessons/12969?language=java
 * @author skoh5
 *
 */
public class C12969 {
	public static void main(String[] args) {
		try (
				Scanner sc = new Scanner(System.in);
				) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			String line = new String(new char[a]).replace("\0", "*");
			String output = Collections.nCopies(b, line+"\n").stream().collect(Collectors.joining(""));
			System.out.println(output);
		}
	}
}
