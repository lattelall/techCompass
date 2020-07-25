package branch;

// java.util.Scannerをインポート
import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		// Scannerクラスのインスタンスを作成
		// 引数で標準入力System.inを指定する
		Scanner sc = new Scanner(System.in);

		System.out.println("10以上の数字を入力してください ");
		int inputnum = sc.nextInt( ); //実数、0、負の数は想定しない
		if(inputnum < 10) { //10未満のとき10倍する
			inputnum = inputnum * 10;
		}

		System.out.println(inputnum);
		// Scannerクラスのインスタンスをクローズ
		sc.close();
	}

}
