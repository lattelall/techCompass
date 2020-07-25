package instance;
/*クラス「Person」、クラスのアクセス制限「public」
 * フィールド「name」（名前情報）、「age」（年齢情報）
 * フィールドのアクセス修飾子は記載なし
 * アクセス修飾子「public,protected,指定なし(デフォルト),private」の4種
 */
public class Person { //Personクラス、アクセス制限public
	String name = ""; //フィールド「name」
	int age = 0; //フィールド「age」

	public void myProfile(){
		System.out.println("私の名前は" + this.name + "です。");
		System.out.println("年齢は" + this.age + "です。");
		System.out.println("よろしくお願いします。");
	}
}
