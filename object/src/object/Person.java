package object;

public class Person {
	//名前(privateでカプセル化。自身のクラスのみアクセス可能)
	private String name;
	//年齢(privateでカプセル化。自身のクラスのみアクセス可能)
	private int age;
	//お財布（staticをつけて静的フィールド）
	static int wallet = 0;

	//name,ageのgetterとsetter(publicでカプセル化。すべてのクラスからアクセス可能)
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getage() {
		return this.age;
	}
	public void setage(int age) {
		this.age = age;
	}

	//Personクラスのコンストラクタと、コンパイルエラー除けデフォルトコンストラクタ
	public Person(String name, int age){
		this.name =  name;
		this.age = age;
	}
	public Person(){}

	//課題2
	public Person(int money) {
		this.wallet = this.wallet + money;
	}


	public void myProfile() {
		System.out.println("私の名前は" + this.name + "です。");
		System.out.println("私の年齢は" + this.age + "才です。");
		System.out.println("よろしくお願いします。");
	}
}
