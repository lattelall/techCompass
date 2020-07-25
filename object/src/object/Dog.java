package object;

public class Dog extends Animal { //Dogクラス、extendsでAnimalクラスを継承
	double weight; //フィールドweight

	//コンストラクタ
	public Dog(){}
	public Dog (String name, int age ,double weight){
		this.name = name;
		this.age = age;
		this.weight = weight;
}

	public void run() { //runメソッド
		System.out.println(this.name + "は走った");
	}

	public void sleep() { //Animalクラスの「眠る」メソッドをオーバーライド
		System.out.print(this.name + "は");
		super.sleep(); //super.()で親クラスAnimalのsleepメソッドを呼び出し
	}

}
