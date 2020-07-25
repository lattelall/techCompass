package method;

public class Task1 {
/*メソッドを作成し、コンソールに自己紹介文を表示
 * メソッド名:main,myProfile
 * 引数:名前(文字列String)、年齢(数値int)、身長(浮動小数float)
 * 戻り値:なし
 */
	public static void main(String[] args) {
		myProfile("田中尭", 29, 168.0f); //引数3つ、floatは数値の後にfかFをつける
	}

	public static void myProfile(String name, int age, float height) { //メソッドを作成、変数name,age,float
		System.out.println("私の名前は" + name + "です。");
		System.out.println("年齢は" + age + "歳です。");
		System.out.println("私の身長は" + height + "cmです。");
		System.out.println("よろしくお願いします。");
	}

}
