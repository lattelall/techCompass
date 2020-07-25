package standardClass;

public class Task3 {
/*Stringクラスのメソッドとループ処理を使用し文字列を逆順に表示
 * 文字列"ABCDEFG"
 */
	public static void main(String[] args) {
		String s = "ABCDEFG";
		String str = "文字列: " + s;
		System.out.println(str);

		//文字列を配列化し後ろから順に表示
		for(int i = str.length()-1; i >= 0; i--) { //.length()でString型変数の文字数を取得
			System.out.print(str.charAt(i)); //.charAt(n)でString型変数のn文字目を表示
		}

		/* 以下旧処理
		 * String[]arrayStr = str.split(""); //1文字ずつ分割し配列化
		 * for(int i = arrayStr.length-1; i >= 0; i--) {
		 *     System.out.print(arrayStr[i]);
		 * }
		 */
	}

}
