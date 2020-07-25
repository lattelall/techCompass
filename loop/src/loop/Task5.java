package loop;

public class Task5 {

	public static void main(String[] args) {
		/*九九の表を生成する
		 * 一桁なら半角スペース二つ挿入、二桁なら一つ
		 */
	for(int row = 1; row <= 9 ; row++) { //縦軸の処理

		for(int columm = 1; columm <= 9; columm++) { //横軸の処理
			if(row * columm <= 9) { //掛け算結果が一桁の時スペースを一つ追加
				System.out.print(" ");
				}
			System.out.print(" " + row * columm);
			}

		System.out.println(); //横軸の処理を一行終えたら改行を入れる
		}
	}
}
