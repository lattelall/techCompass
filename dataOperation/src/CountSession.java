

import java.io.IOException;
import java.io.PrintWriter;//PrintWriterをインポート

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;//HttpSessionをインポート


@WebServlet("/CountSession")
public class CountSession extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public CountSession() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();

		//html上で扱うための変数を作成
		String visitNum = null;
		//セッション
		HttpSession session = request.getSession(false);

		if(session == null) { //初回、セッション作成
			session = request.getSession(true);
			session.setAttribute("Visit", "1");
			visitNum = "初めて";
		}else {
			String visitStr = (String)session.getAttribute("Visit"); //sessionの値をキャスト。Object→String
        	int count = Integer.parseInt(visitStr) +1; //String型→int型、回数を増やす
        	session.setAttribute("Visit", Integer.toString(count)); //増やしたカウントをセッションに入れ直す
        	visitNum = (int)count + "回目";
        }

		//以下html
        out.println("<html>");
        out.println("<head>");
        out.println("<title>セッションテスト</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>訪問回数テスト (セッション)</h1>");
        out.println("<p>" + visitNum + "の訪問です</p>");
        out.println("<a href='/dataOperation/CountSession'>画面を再訪問</a>"); //このページにリンク付け
        out.println("</body>");
        out.println("</html>");
		//以上html
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
