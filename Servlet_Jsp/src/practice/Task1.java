package practice;

import java.io.IOException;
import java.io.PrintWriter; //PrintWriterをインポート

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Task1")
public class Task1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Task1() {
        super();
    }
     //doGetメソッド、htmlでHellServlet
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html; charset = UTF-8");
		PrintWriter out = response.getWriter();
	     //以下html
	    out.println("<!DOCTYPE html>");
	    out.println("<html>");
	    out.println("<head>");
	    out.println("<meta charset = 'UTF-8'>");
	    out.println("<title>ServletJsp</title>");
	    out.println("</head>");
	    out.println("<body>");
	    out.println("<h1>HelloServlet</h1>");
	    out.println("</body>");
	    out.println("</html>");
	    //以上html
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}