package branch;

import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("正の整数を2つ入力してください ");
		//入力された文字列を変数にする
		System.out.print("numA:");
		String a = sc.nextLine();
		System.out.print("numB:");
		String b = sc.nextLine();

		//整数か判定、文字列の頭文字が1～9、二文字目以降が0～9ならば整数、a,b両方が整数でtrue
		if(a.matches("^[1-9][0-9]*$") && b.matches("^[1-9][0-9]*$")) {
			int numA = Integer.parseInt(a); //文字列の変数をintに変換
			int numB = Integer.parseInt(b);

			if(numA % numB == 0) { //a/bの余りが0なら約数
				System.out.println("numBはnumAの約数です");
			}else {
				System.out.println("numBはnumAの約数ではありません");
			}			
		}else { //どこかしら整数ではないときの処理
			System.out.println("正の整数を入力してください");
		}

		sc.close();
	}

}