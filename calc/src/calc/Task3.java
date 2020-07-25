package calc;

// java.util.Scannerをインポート
import java.util.Scanner;

public class Task3 {

  public static void main(String[] args) {
    // Scannerクラスのインスタンスを作成
    // 引数で標準入力System.inを指定する
    Scanner scanner = new Scanner(System.in);

    // scanner.nextIntで整数、scanner.nextLineで文字列
    int inputnumA = scanner.nextInt();
    int inputnumB = scanner.nextInt();
    int inputnumC = scanner.nextInt();
    int sum = inputnumA + inputnumB + inputnumC ;
	int ave1 = sum / (int)(3.0); //3.0を指定してintにキャスト変換
	double ave2 =sum / 3.0;

    System.out.println("合計:" + sum);
	System.out.println("平均(3で割った時):" + ave1);
	System.out.println("平均(3.0で割った時):" + ave2);

    // Scannerクラスのインスタンスをクローズ
    scanner.close();
	}

}
