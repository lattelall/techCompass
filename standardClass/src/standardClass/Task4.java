package standardClass;

import java.util.Scanner;

public class Task4 {
/* Stringクラスのメソッドと標準入力を使用
 * 標準入力でアルファベットを受け取り、文字列に含まれているか判定せよ
 * 文字列"ABCDGOPQRSYZ"
 */
	public static void main(String[] args) {
		String str = "ABCDGOPQRSYZ";

		//標準入力で文字列を受け取る
		System.out.print("探したい文字: ");
	    Scanner scanner = new Scanner(System.in);
	    String input = scanner.nextLine();

	  //文字列strにinputを含むか判定
		System.out.print(str + "は" + input);
		if(str.contains(input)) {
			System.out.println("を含む");
		}else{
			System.out.println("を含まない");
		}
		scanner.close();
	}

}