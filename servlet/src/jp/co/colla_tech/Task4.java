package jp.co.colla_tech;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random; //Randomクラスをインポート

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Task4") //URL
public class Task4 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Task4() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset = UTF-8");
		PrintWriter out = response.getWriter();

		//占いプログラム
		String[] luck = {"大吉","中吉","小吉","末吉","凶","大凶"};
		int random = new Random().nextInt(6); //0~5の乱数を生成
		String fortune = luck[random]; //乱数に対応した文字列（運勢）を取り出し

		//以下html（HtmlTemplateのheaderとfooterで挟む）
		HtmlTemplate.header(out);
		out.println("<p>↓占い結果↓</p>");
		out.println("<h1>" + fortune + "</h1>"); //占い結果fortuneは変数なので""で挟まない
		HtmlTemplate.footer(out);
		//以上html
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
