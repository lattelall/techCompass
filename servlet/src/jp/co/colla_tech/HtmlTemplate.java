package jp.co.colla_tech;

import java.io.PrintWriter; //PrintWriterをインポート

public class HtmlTemplate {

    //headerメソッド
    public static void header(PrintWriter out){ //引数はPrintWriter out
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset = UTF-8>");
        out.println("<title>ServletTask</title>");
        out.println("</head>");
        out.println("<body>");
    }

    //footerメソッド
    public static void footer(PrintWriter out){
        out.println("</body>");
        out.println("</html>");
    }
}
