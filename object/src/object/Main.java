package object;

public class Main{
	public static void main(String[] args) {
		System.out.println("インスタンスを定義してない状態");
		System.out.println(Person.wallet);

		//インスタンスを2つ生成
		Person hoge1 = new Person(1000);
		Person hoge2 = new Person(2000);

		System.out.println("インスタンスhoge01でwalletにアクセス");
		System.out.println(hoge1.wallet);
		System.out.println("インスタンスhoge02でwalletにアクセス");
		System.out.println(hoge2.wallet);
		System.out.println("クラスPersonでwalletにアクセス");
		System.out.println(Person.wallet);

		//以下課題5
		System.out.println("\n===以下課題5===");

		Dog status1 = new Dog("ポチ", 5,12.3); //Dogクラスのインスタンスを生成、name,age,weightに代入
		Animal dogdog =new Animal(); //「眠った」のみの表示に使用

		System.out.println("名前: " + status1.name);
		System.out.println("年齢: " + status1.age + "歳");
		System.out.println("体重: " + status1.weight + "kg");

		status1.run(); //Dogクラスのrunメソッドを実行
		dogdog.sleep(); //Animalクラスのsleepメソッドを実行
		status1.sleep(); //Dogクラスのsleepメソッドを実行
	}
}
