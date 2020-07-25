package branch;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("1から5までの数字を入れてください ");
		int inputNum = sc.nextInt(); //入力された文字列を変数にする
		String outputNum = "unknown";

		//変数inputNumが1～5なら変数outputNumにそれぞれのローマ数字を上書き
		switch(inputNum) {
		case 1:
			outputNum = "Ⅰ";
			break;
		case 2:
			outputNum = "Ⅱ";
			break;
		case 3:
			outputNum = "Ⅲ";
			break;
		case 4:
			outputNum = "Ⅳ";
			break;
		case 5:
			outputNum = "Ⅴ";
			break;
		//1~5ではないときは処理なしなのでdefaultはなし
		}
		System.out.print(inputNum + " -> " + outputNum); //printlnは一度使ったのでprintにする
		sc.close();
	}

}
