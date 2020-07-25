package array;

import java.util.Random; //Randomクラスをインポート

public class Task3 {
/*0～9のランダムな値を格納したint型配列、最大値と再招致を求める
 * Randomクラスを用いる、分岐処理で","の制御をする
 */
	public static void main(String[] args) {
		Random r = new Random(); //Randomジェネレータを作成
		int[] array = new int[6];

		//配列全ての要素に乱数を代入
		System.out.print("配列: [");
		for(int i = 0; i < array.length; i++) {
			int rnd  =r.nextInt(10); //int型変数rndに0~9の乱数を取得
			array[i] = rnd;
			System.out.print(array[i]);
			if(i < array.length - 1){
				System.out.print(",");
			}
		}
		System.out.print("]\n");

		//配列の要素を取り出して最大値最小値を調べる
		int max = 0;
		int min = 9; //最小値を求めるため最初に代入するのはランダム値最大の9
		for(int i = 0; i < array.length; i++) {
			if(max < array[i]) {
				max = array[i];
			}
			if(min > array[i]) {
				min = array[i];
			}
		}
		System.out.println("最大値: " + max);
		System.out.println("最小値: " + min);
	}
}
