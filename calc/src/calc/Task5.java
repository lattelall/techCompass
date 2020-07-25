package calc;

//java.util.Scannerをインポート
import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
	    // Scannerクラスのインスタンスを作成
	    // 引数で標準入力System.inを指定する
	    Scanner sc = new Scanner(System.in);

	    //先にノートPCの値段89800円を出力
	    String note = "ノートPCの値段";
	    int price = 89800;
	    char yen = '円';
	    System.out.println(note + ": " + price + yen  );

	    String inputtextA = sc.nextLine(); //標準入力の文字列を変数へ
	    String inputtextB = sc.nextLine();

		System.out.println(inputtextA + inputtextB );

	    // Scannerクラスのインスタンスをクローズ
	    sc.close();
	}

}
