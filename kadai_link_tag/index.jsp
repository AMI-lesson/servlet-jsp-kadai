<%-- コンテンツタイプを指定 --%>
<%@ page contentType="text/html; charset=UTF-8" %>

<html>
    <head>
        <title>Servlet/JSPの基礎を学ぼう</title>
    </head>
    <body>
    	<%--名前「侍太郎」をServletに送信リンク --%>
        <a href="link?name=侍太郎">名前「侍太郎」をServletに送信</a>

		<%--改行 --%>
        <br><br>

		<%--  message=Selectからデータを送信しました：侍太郎さん、こんにちは！と表示 --%>
        <%
        String message = (String) request.getAttribute("message");
        if (message != null) {
        %>
            <p><%= message %></p>
        <%
            }
        %>
    </body>
</html>