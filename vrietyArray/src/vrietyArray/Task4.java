package vrietyArray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Task4 {
	/*配列の数字を偶数奇数に分け、別のArrayListの格納、map配列でラベル付けを行い表示する
	 * 出力はSystem.out.printlnにmap変数を指定
	 * {21, 3, 32, 6, 99, 72, 78, 51, 1, 26, 87, 11, 48, 60, 29, 5, 46, 74, 14, 193, 215, 83}
	 */
	public static void main(String[] args) {
		int[] array = {21, 3, 32, 6, 99, 72, 78, 51, 1, 26, 87, 11, 48, 60, 29, 5, 46, 74, 14, 193, 215, 83};

		//Arraylistを作り偶数奇数で振り分け
		ArrayList<Integer> odd = new ArrayList<>(); //奇数
		ArrayList<Integer> even = new ArrayList<>(); //偶数
		for(int i = 0;i < array.length; i++ ) {
			if(array[i] % 2 == 0) { //2で割り切れれば偶数に振り分け、そうでなければ奇数へ
				even.add(array[i]);
			}else {
				odd.add(array[i]);
			}
		}

		//振り分けたArrayList配列をmap配列に代入しラベル付け（型を<String,ArrayList<Integer>>とする）
		Map<String, ArrayList<Integer>> numMap = new HashMap<>();
		numMap.put("奇数",odd);
		numMap.put("偶数",even);

		//表示
		System.out.print( numMap.entrySet());
		}
}
