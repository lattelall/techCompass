package vrietyArray;

import java.util.ArrayList; //ArrayListクラスをインポート

public class Task1 {
/*ArrayListに文字列を追加、表示する
 * 北海道,東北,関東,中部,近畿,中国,九州
 */
	public static void main(String[] args) {
		ArrayList<String> japanArea = new ArrayList<>();
		japanArea.add("北海道");
		japanArea.add("東北");
		japanArea.add("関東");
		japanArea.add("中部");
		japanArea.add("近畿");
		japanArea.add("中国");
		japanArea.add("九州");
		
		for(String area : japanArea) {
			System.out.println(area);
		}
	}

}
