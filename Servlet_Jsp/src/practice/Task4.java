package practice;

import java.io.IOException;
//DateとRandomをインポート
import java.util.Date;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Task4")
public class Task4 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Task4() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//占い作成（配列に文字列を格納、ランダム取得）
        String[] index = {"大吉", "中吉", "小吉", "末吉", "凶", "大凶"};
        Random random = new Random();
        String fortune = index[random.nextInt(6)];

		//日付を取得
        Date today = new Date();

		//FortuneBeanに日付todayと占い結果fortuneをデータ格納（setterメソッド）
        FortuneBean fortuneBean = new FortuneBean();
        fortuneBean.setToday(today);
        fortuneBean.setFortune(fortune);
        //fortuneBeanをリクエストスコープに格納、fortuneResultと名付ける
        request.setAttribute("fortuneResult","fortuneBean");

		//"WEB-INFフォルダ内のfortune_result.jsp"にフォワード処理
		request.getRequestDispatcher("/WEB-INF/fortune_result.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
