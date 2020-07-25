import java.io.IOException;
import java.io.PrintWriter;//PrintWriterのインポート

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Result")
public class Result extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    		throws ServletException, IOException {

        //リクエストパラメータを取得
        request.setCharacterEncoding("UTF-8");
        //各入力内容の取得
        String name = request.getParameter("name");
        String sex = request.getParameter("sex");
        if(sex.equals("male")) {
        	sex = "男性";
        }else if(sex.equals("female")){
        	sex = "女性";
        }
        String question = request.getParameter("question");
        if("aboutProduct".equals(question)) {
        	question = "１.製品について";
        }else if("badDefect".equals(question)){
        	question = "２.不具合やクレーム";
        }else if("customerSuport".equals(question)){
        	question = "３.アフターサポート";
        }
        String textArea = request.getParameter("textArea");


        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        //以下html
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset=\"UTF-8\">");
        out.println("<title>想定画面02</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("以下の内容でお問合わせしました。回答をお待ちください。<br>");
        out.println("<br>");
        out.println("名前:" + name + "様<br>");
        out.println("性別:" + sex + "<br>");
        out.println("お問合わせ種類:" + question + "<br>");
        out.println("お問合わせ内容:" + textArea + "<br>");
        out.println("</body>");
        out.println("</html>");
        //以上html

	}

}