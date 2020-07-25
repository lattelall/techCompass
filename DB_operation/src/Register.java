import java.io.IOException;
//java.sql.*でインポート
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Register() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset = UTF-8");

        //各入力内容の取得
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		Date birthday = Date.valueOf(request.getParameter("birthday"));
		int age = Integer.parseInt(request.getParameter("age"));

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
			//SQL文実行、入力された内容をデータベースに追加する
			String sql = "INSERT INTO employee (id, name, birthday, age) VALUES(?, ?, ?, ?);";
			PreparedStatement ps = con.prepareStatement(sql);
			//SQL文の？に値を設定
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setDate(3, birthday);
			ps.setInt(4, age);

			int result = ps.executeUpdate();
			System.out.println(result + "行が追加されました");
			ps.close();

			//入力した情報の表示
			response.getWriter().append("<p>登録完了</p>");
			response.getWriter().append("<p>ID:" + id + "</p>");
			response.getWriter().append("<p>名前:" + name + "</p>");
			response.getWriter().append("<p>誕生日:" + birthday + "</p>");
			response.getWriter().append("<p>年齢:" + age + "</p>");

		//例外が発生したらエラーコードを表示
		}catch (SQLException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		} finally {//データベース切断
			if (con != null) {
				try {
					con.close();
				}catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
