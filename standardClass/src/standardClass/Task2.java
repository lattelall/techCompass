package standardClass;

public class Task2 {
/*Stringクラスのメソッドを使用し文字列を抽出
 * "Java Programming Training" -> "Training","Java Programming"
 */
	public static void main(String[] args) {
		String str = "Java Programming Training";
		String subStr1 = str.substring(17); //17文字目（T）から後を抽出
		String subStr2 = str.substring(0,16); //0文字目から抽出開始、16文字目で終了（0～15を抽出）

		System.out.println(subStr1);
		System.out.println(subStr2);
	}

}
