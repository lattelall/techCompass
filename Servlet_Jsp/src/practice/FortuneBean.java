package practice;

import java.io.Serializable;
import java.util.Date; //Dateをインポート

//JavaBeansの作成、データ受け渡し（リクエストスコープ）のためのデータ保管所
//java.io.Serializeableインターフェースの実装
public class FortuneBean implements Serializable{

	//privateなフィールドの作成
    private Date today;
    private String fortune;

    public FortuneBean() {
	}

	//フィールドの値を取得・設定するためgetter・setterメソッドを作成
    public Date getToday() {
        return this.today;
    }
    public void setToday(Date today) {
        this.today = today;
    }

    public String getFortune() {
        return this.fortune;
    }
    public void setFortune(String fortune) {
        this.fortune = fortune;
    }
}
