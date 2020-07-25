package standardClass;
/*文字列の変換、Stringクラスのメソッドを使用
 * " tech-compass "->"TECH-COMPASS"
 */
public class Task1 {

	public static void main(String[] args) {
		String str =" tech-compass ";
		String cutStr = str.trim(); //文字列前後の空白を取り除く
		String upperStr = cutStr.toUpperCase(); //文字列をすべて大文字にする

		System.out.println("変換前: " + str);
		System.out.println("変換後: " + upperStr);
	}

}
