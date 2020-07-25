package method;

public class Task3 {
/*メソッドを三つ使用、戻り値を表示
 * オーバーロードを使用すること
 */
	public static void main(String[] args) {
		System.out.println("---①文字列だけの場合---");
		System.out.println(add("Hello","World"));

		System.out.println("---②整数だけの場合---");
		System.out.println(add(18,42));

		System.out.println("---③小数だけの場合---");
		System.out.println(add(3.14,2.8));
	}

	public static String add(String x,String y) { //Stringを受け取り戻り値を返す
		return x + y;
	}

	public static int add(int x, int y) { //intを受け取り戻り値を返す
		return  x + y;
	}

	public static double add(double x, double y) { //doubleを受け取り戻り値を返す
		return  x + y;
	}

}
