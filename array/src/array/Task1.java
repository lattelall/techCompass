package array;

public class Task1 {
/*配列に格納されている数字の取り出しと合計をする
 * 配列の値の表示はfor文と分岐処理、合計は拡張for文を用いること
 * {4,9,19,5,8,21,42,64,73,18,2}
 */
	public static void main(String[] args) {
		int[] array = {4,9,19,5,8,21,42,64,73,18,2};
		int sum = 0;
		System.out.print("配列: [");
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			if(i <= array.length - 2) { //配列のインデックス数はarray.length-1（0始まりのため）、なので-2になる
				System.out.print(",");
				}
			}
		System.out.print("]\n");
		System.out.print("合計: ");
		for(int a : array){ //拡張for文、変数aに配列arrayの中身を順に取り出していく
			sum += a;
		}
		System.out.print(sum);
	}

}
