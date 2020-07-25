package standardClass;

public class Task5 {
/* Stringクラスのメソッドを使用
 * 文字列に含まれる単語2種のどちらが多いか比較せよ
 * 文字列"cat_mouse_mouse_cat_cat"
 */
	public static void main(String[] args) {
		String str = "cat_mouse_mouse_cat_cat";
		String[]arrayStr = str.split("_"); // '_'で文字列を区切り配列化
		int countC = 0;
		int countM = 0;

		// 文字列がmouseかcatに一致するか調べ、一致するたびに対応するカウントを増やす。
		for(int i =0; i < arrayStr.length; i++) {
			if(arrayStr[i].equals("cat")) { // 文字列の一致を調べるには.equals("")を使用（==は使わない）
				countC++;
			}else if(arrayStr[i].equals("mouse")) {
				countM++;
			}
		}

		if(countC > countM) {
			System.out.println("catの方が多い");
		}else if(countC < countM) {
			System.out.println("mouseの方が多い");
		}else if(countC == countM) {
			System.out.println("catとmouseは同じ数");
		}
	}
}