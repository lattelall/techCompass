package loop;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		/* 正の整数を受け取り、約数をすべて表示する
		 * 分岐とループを使用、割り続け、%=0のときだけ表示する分岐
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("正の整数を入力してください: " );
		long inputNum = sc.nextLong();//入力される自然数、繰り返しの上限
		System.out.print(inputNum + "の約数: ");

		//1から順に割っていき、余りが出なければ約数として表示、inputNum-1まで処理
		for(int i = 1; i < inputNum; i++) {
			if(inputNum % i == 0) {
				System.out.print(i + ",");
			}
		}
		System.out.print(inputNum); //","の表示の兼ね合いから、inputNumを最後に付け足し

		sc.close();
	}
}
