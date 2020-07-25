import java.io.IOException;
//java.sql.*でインポート
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Search")
public class Search extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Search() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    		throws ServletException, IOException {

    	request.setCharacterEncoding("UTF-8");
    	response.setContentType("text/html; charset = UTF-8");

    	//変数
    	int idFind = 0;
    	String nameFind = null;
    	Date birthdayFind = null;
    	int ageFind = 0;

    	//入力された名前を取得
    	String name = request.getParameter("name");

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

    		//SQL文、入力語句を含む名前を検索
    		String sql = "SELECT id,name,birthday,age FROM employee WHERE name LIKE ?;";
    		PreparedStatement ps = con.prepareStatement(sql);
    		//SQL文の？に値を設定
    		ps.setString(1, "%" + name + "%");

    		//ResultSetにデータベースでの検索結果を格納
    		ResultSet rs = ps.executeQuery();
    		while (rs.next()) {
    			idFind = rs.getInt("id"); //カラムidの値を格納
    			nameFind = rs.getString("name"); //カラムnameの値を格納
    			birthdayFind = rs.getDate("birthday"); //カラムbirthdayの値を格納
    			ageFind = rs.getInt("age"); //カラムageの値を格納

    			response.getWriter().append("<p>ID:" + idFind + "</p>");
    			response.getWriter().append("<p>名前:" + nameFind + "</p>");
    			response.getWriter().append("<p>生年月日:" + birthdayFind + "</p>");
    			response.getWriter().append("<p>年齢:" + ageFind + "</p>");
    		}
    		rs.close();
    		ps.close();

    	//エラー処理＆データベース切断
    	} catch (SQLException e) {
    		e.printStackTrace();
    	}catch(ClassNotFoundException e){
    		e.printStackTrace();
    	} finally {
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
