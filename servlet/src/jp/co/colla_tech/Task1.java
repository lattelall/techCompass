package jp.co.colla_tech;


import java.io.IOException;
//PrintWriterをインポート
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Task1") //URLに設定
public class Task1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Task1() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset = UTF-8");
		PrintWriter out = response.getWriter();
		//ここからhtml
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset = 'UTF-8'");
		out.println("<title>ServletTask</title>"); //titleに設定
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Hello Servlet</h1>");
		out.println("<p>初めてのサーブレット</p>");
		out.println("</body>");
		out.println("</html>");
		//ここまでhtml
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response); //doGetメソッドをオーバーライド
	}

}
