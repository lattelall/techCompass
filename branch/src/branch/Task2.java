package branch;

// java.util.Scannerをインポート
import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		// Scannerクラスのインスタンスを作成
		// 引数で標準入力System.inを指定する
		Scanner sc = new Scanner(System.in);

		System.out.println("数字を入力してください ");
		int inputnum = sc.nextInt( ); //実数、0、負の数は想定しない
		if(inputnum < 10) {
			System.out.println("値:0" + inputnum) ;  //10未満のとき0+数字表示
		}else {
			System.out.println("値:" + inputnum); //10以上のときそのまま表示
		}

		// Scannerクラスのインスタンスをクローズ
		sc.close();
	}

}
