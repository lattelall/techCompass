

import java.io.IOException;
import java.io.PrintWriter; //Printwriterをインポート

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie; //Cookieをインポート
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/CountCookie")
public class CountCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public CountCookie() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();

		//html上で扱うための変数を作成
		String visitNum = null;
		//visitedCookieを作成、Cookieを呼び出し
		Cookie [] visitedCookie = request.getCookies();


		//Cookieによる訪問回数のカウント、取り出し
        if(visitedCookie != null) { //visitedCookieがnullではない場合
            for(int i = 0; i < visitedCookie.length; i++) {
                if(visitedCookie[i].getName().equals("Visit")) { //Visit（名前）を検索
                	int count = Integer.parseInt(visitedCookie[i].getValue()) +1; //Visitの対応値を取り出しint型に変換してから＋1
                    visitedCookie[i].setValue(String.valueOf(count)); //String型にしてvisitedCookieに入れなおす
                    visitedCookie[i].setMaxAge(300); //有効期限300秒
                    response.addCookie(visitedCookie[i]); //visitedCookieを保存
                    visitNum = count + "回目"; //現在の訪問回数の取り出し
                }
            }
        }else { //visitedCookieがnull(クッキーを生成)
    		//Cookieの設定
    		Cookie cookie = new Cookie("Visit", "1");
    		cookie.setMaxAge(300); //有効期限300秒
    		response.addCookie(cookie); //cookieを保存、次回アクセス時より使用可能

        	visitNum = "初めて";
        }

		//以下html
        out.println("<html>");
        out.println("<head>");
        out.println("<title>クッキーテスト</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>訪問回数テスト (クッキー)</h1>");
        out.println("<p>" + visitNum + "の訪問です</p>");
        out.println("<a href='/dataOperation/CountCookie'>画面を再訪問</a>"); //このページにリンク付け
        out.println("</body>");
        out.println("</html>");
		//以上html
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
