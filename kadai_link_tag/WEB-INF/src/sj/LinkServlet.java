package sj;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LinkServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");

		request.setAttribute("text", "Servletからデータを受信しました：侍太郎さん、こんにちは！");
		RequestDispatcher dispatchere = request.getRequestDispatcher("/index.jsp?user=侍太郎");
		dispatchere.forward(request, response);
	}
}