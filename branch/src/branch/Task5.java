package branch;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 //入力される数字は整数のみ想定
		System.out.print("numA: " );
		int a = sc.nextInt();
		System.out.print("numB: " );
		int b = sc.nextInt();
		System.out.print("numC: " );
		int c = sc.nextInt();
		
		//最大値を求める。変数maxにa→b→cの順番でに大きければ上書き処理
		int max = a;
		if(max < b) {
			max = b;
		}
		if(max < c) {
			max = c;
		}

		System.out.print("最大値: " + max);

		sc.close();
	}
}
