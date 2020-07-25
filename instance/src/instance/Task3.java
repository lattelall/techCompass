package instance;

public class Task3 {

	public static void main(String[] args) {
		//インスタンスの生成、Person
		Person person = new Person();
		//インスタンスPersonのフィールドに値を設定
		person.name = "田中尭";
		person.age = 29;

		//インスタンスメソッドの実行、PersonのmyProfile
		person.myProfile();
	}

}
