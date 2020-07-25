package loop;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		/*桁数を表示するプログラム、整数のみを受け取る
		 * 10で割り続け、割った回数を桁数として表示
		 * 桁数なので-は対応、対応桁数は大きい方がよい→lomg
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("数字を入力してください: " );
		long a = sc.nextLong();//入力される自然数、繰り返しの上限
		int i =0;
		while(a != 0) { //aが0になるとループ終了
			i++; //割る回数をカウント
			a /=10; //割り算は余りを切り捨てるので最後は0になる
		}
		System.out.print("桁数: " + i);
		sc.close();
	}
}
