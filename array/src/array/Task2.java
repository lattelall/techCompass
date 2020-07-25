package array;

public class Task2 {
// インデックス数7の配列を用意、ループ処理で7~1を順番を代入し、値を表示する

	public static void main(String[] args) {
		int[] array =new int[7];
		int a = array.length;

		//配列に7（インデックス数）～1の順に数字を代入、表示
		for(int i = 0; i < array.length; i++){
			array[i] = a;
			a--;
			System.out.print(array[i]);
			if(i < array.length - 1) {
				System.out.print(",");
			}
		}
		System.out.print("\n");

		//配列を逆順に表示
		for(int j =array.length - 1; j >= 0;j--) {
			System.out.print(array[j]);
			if(j > 0) { //インデックス0の手前まで,を入れる
				System.out.print(",");
			}
		}
	}

}
