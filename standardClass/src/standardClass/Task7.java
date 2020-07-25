package standardClass;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Task7 {
/*現在日時を取得し、1週間後と1年後の日付を表示するプログラムの作成
 * 1週間後はaddメソッド、1年後はsetメソッドを使用し曜日も表示
 * 表示形式、1週間後"〇〇〇〇年〇〇月〇〇日"、1年後"〇〇〇〇年〇〇月〇〇日（曜日）"
 */
	public static void main(String[] args) {
		String[] week = new String[] {"日","月","火","水","木","金","土"}; //曜日を配列で設定
		SimpleDateFormat sdf1= new SimpleDateFormat("yyyy年MM月dd日"); //表示形式を指定

		//今日の日付
		Calendar today = Calendar.getInstance(); //Calendarクラスで現在日時を取得
		System.out.println("現在日時: " + sdf1.format(today.getTime())); //Calendar型なのでformatの引数に（変数.getTime()）

		//1週間後の日付（addメソッド）
		Calendar sevenDlater = today;
		sevenDlater.add(Calendar.DAY_OF_MONTH, 7); //7日分add
		System.out.println("１週間後: " + sdf1.format(sevenDlater.getTime()));

		//1年後の日付（setメソッド）
		Calendar oneYlater = Calendar.getInstance(); //addメソッドで7日後になっているので現在日時を再取得
		oneYlater.set(Calendar.YEAR, oneYlater.get(Calendar.YEAR) + 1); //現在日時＋1年でset
		int i = oneYlater.get(Calendar.DAY_OF_WEEK);//曜日を数値(1~7)で取得
		System.out.print("１年後　: " + sdf1.format(oneYlater.getTime()));
		System.out.println("(" + week[i -1] + ")"); //取得した曜日の数値(1~7)で配列(0~6)を表示
		}
}
