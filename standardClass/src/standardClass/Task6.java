package standardClass;

import java.text.SimpleDateFormat;
//インポートするクラスはDate、SimpleDateFormat
import java.util.Date;

public class Task6 {
/* 現在日時を取得し表示するプログラムを作成
 * 表示形式は"〇〇〇〇年〇〇月〇〇日"、"〇〇〇〇年〇〇月〇〇日〇〇時〇〇分"
 */
	public static void main(String[] args) {
		Date dateNow = new Date(); //現在日時を取得
		SimpleDateFormat sdf1= new SimpleDateFormat("yyyy年MM月dd日"); //表示形式を指定
		SimpleDateFormat sdf2= new SimpleDateFormat("yyyy年MM月dd日HH時mm分");

		System.out.println(sdf1.format(dateNow));
		System.out.println(sdf2.format(dateNow));
		}
}
