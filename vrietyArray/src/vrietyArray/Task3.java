package vrietyArray;

import java.util.HashMap; //HashMapクラスをインポート
import java.util.Map;

public class Task3 {
/*キーと値のペアをmapに格納、表示させる
 * りんご,130、みかん,120、バナナ,98、メロン,6000
 */
	public static void main(String[] args) {
		Map<String, Integer> fruits = new HashMap<>();
		fruits.put("りんご", 130); //.put(,)でキーと値を追加
		fruits.put("みかん", 120);
		fruits.put("バナナ", 98);
		fruits.put("メロン", 6000);

		for(String name : fruits.keySet()) { //keySet()でキーの一覧を返す
			int value = fruits.get(name);
			System.out.println(name + ":" + value + "円");
		}
	}

}
