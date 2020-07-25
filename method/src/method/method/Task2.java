package method;

public class Task2 {
	/*三角形の計算をするメソッドを作成
	 * 引数は底辺と高さ、戻り値は三角形の面積
	 * 計算結果を小数第一位で四捨五入
	 */

	public static void main(String[] args) {
		double answer = getTriangleArea(19.95 ,4.04); //変数answerにgetTriangleAreaからの戻り値を代入
		System.out.println("三角形の面積");
		System.out.println(answer);
	}

	public static double getTriangleArea(double bottom, double height) {
		//計算結果をMath.round()を使用し小数点第一位で四捨五入、整数にする
		//引数と戻り値の型を一致させる
		double ans = bottom * height / 2;
		double ansR = (double)Math.round(ans);
		return ansR; //戻り値
	}

}
