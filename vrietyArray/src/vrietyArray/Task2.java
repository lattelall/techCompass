package vrietyArray;

import java.util.ArrayList;

public class Task2 {
	/*配列内の数値を偶数奇数で振り分けArrayList格納
	 *{21,3, 32, 6, 99, 72, 78, 51, 1, 26, 87, 11, 48, 60}
	 */

	public static void main(String[] args) {
		ArrayList<Integer> even = new ArrayList<>(); //偶数、int型を指定するときはIntegerを使用
		ArrayList<Integer> odd = new ArrayList<>(); //奇数
		int[] array = {21, 3, 32, 6, 99, 72, 78, 51, 1, 26, 87, 11, 48, 60};
		//偶数奇数に振り分け
		for(int i = 0; i < array.length; i++ ) {
			if(array[i] % 2 == 0) { //2で割り切れれば偶数に振り分け、そうでなければ奇数へ
				even.add(array[i]);
			}else {
				odd.add(array[i]);
			}
		}

		System.out.println("奇数: " + odd);
		System.out.println("偶数: " + even);
	}
}
