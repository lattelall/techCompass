//java.sql*をインポート
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {

	public static void main(String[] args) {
		Connection con = null;
		try { //例外処理（エラー処理）のためtry{}で囲む
			//JDBCドライバの読み込み（MySQL
			Class.forName("com.mysql.cj.jdbc.Driver");
			//データベースへの接続（MySQL)、task1
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/task1?serverTimezone=JST", "lattelall", "");
			//接続成功時メッセージ
			if (con != null) {
				System.out.println("DB接続が成功しました");
			}
		}catch (Exception e) { //例外が発生したらExceptionエラーコードを変数eに代入
			System.out.println(e); //エラーコードを表示

		}finally { //例外有無に関わらずデータベース切断を実行
			if (con != null) {
				try { //例外処理のたけtry{}
					con.close(); //データベース切断
				}catch (SQLException e) { //データベース切断でエラーを受け取っていたら表示
					System.out.println(e);
				}
			}
		}
	}
}