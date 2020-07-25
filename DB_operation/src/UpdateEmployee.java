import java.io.IOException;
//java.sql.*でインポート
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/UpdateEmployee")
public class UpdateEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public UpdateEmployee() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    		throws ServletException, IOException {

    	request.setCharacterEncoding("UTF-8");
    	response.setContentType("text/html; charset = UTF-8");

    	//入力されたID、名前を取得
    	int id = Integer.parseInt(request.getParameter("id"));
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

    		//SQL文、該当IDの名前カラムを更新
    		String sql = "UPDATE employee SET name = ? WHERE id = ?;";
    		PreparedStatement ps = con.prepareStatement(sql);
    		//SQL文の？に値を設定
    		ps.setString(1, name);
    		ps.setInt(2, id);

    		ps.close();

        	//更新した情報の表示
        	response.getWriter().append("<p>更新完了</p>");
        	response.getWriter().append("<p>ID:" + id + "</p>");
        	response.getWriter().append("<p>名前:" + name + "</p>");

       	//エラー処理＆データベース切断
    	}catch (SQLException e) {
    		e.printStackTrace();
    	}catch(ClassNotFoundException e){
        	e.printStackTrace();
    	}finally {
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