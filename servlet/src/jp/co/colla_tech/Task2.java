package jp.co.colla_tech;


import java.io.IOException;
//PrintWriter、SimpleDateFormat、Dateをインポート
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Task2") //URLに設定
public class Task2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Task2() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset = UTF-8");
		PrintWriter out = response.getWriter();

		//現在日時を取得、表示形式の決定
		Date now = new Date();
	    SimpleDateFormat today =new SimpleDateFormat("yyyy年MM月dd日");

		//ここからhtml
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset = 'UTF-8'");
		out.println("<title>ServletTask</title>"); //titleに設定
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>今日の日付: " + today.format(now) + "</h1>");
		out.println("</body>");
		out.println("</html>");
		//ここまでhtml
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response); //doGetメソッドをオーバーライド
	}

}