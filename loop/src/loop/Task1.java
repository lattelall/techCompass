package loop;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//入力される数字は整数のみ想定
		System.out.print("数字を入力してください: " );
		int a = sc.nextInt();
		int sum = 0;

		for(int i =1; i <= a; i++) {//変数iは1から開始、i≦aの時処理実行、処理がループする度iは1増える
			sum += i; //sumにsum+iを代入
		}
		System.out.println("1～" + a + "までの合計: " + sum);
		sc.close();
	}
}
