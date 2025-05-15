package sj;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LinkServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // URLパラメータ「name」を取得
        String name = request.getParameter("name");
        name="侍太郎";

        //  message=Selectからデータを送信しました：侍太郎さん、こんにちは！と表示
        // メッセージを作成してリクエストスコープに保存
        String message = "Servletからデータを受信しました：" + name + "さん、こんにちは！";
        request.setAttribute("message", message);

        // JSPにフォワード
        RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
        dispatcher.forward(request, response);
    }
}

