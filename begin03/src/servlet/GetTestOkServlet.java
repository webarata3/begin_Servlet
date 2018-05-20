package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/get-test-ok")
public class GetTestOkServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding(StandardCharsets.UTF_8.name());
        String param1 = request.getParameter("param1");
        param1 = sanitizeString(param1);
        String param2 = request.getParameter("param2");
        param2 = sanitizeString(param2);

        response.setContentType("text/html");
        response.setCharacterEncoding(StandardCharsets.UTF_8.name());
        try (PrintWriter out = response.getWriter()) {
            out.println("<html><head><meta charset=\"utf-8\"></head><body>");
            out.println("param1=" + param1 + "<br>");
            out.println("param2=" + param2 + "<br>");
            out.println("</body></html>");
        }
    }

    public String sanitizeString(String str) {
        if (str == null) return str;
        return str.replaceAll("&", "&amp;").replaceAll("<", "&lt;").replaceAll(">", "&gt;").replaceAll("\"", "&quot")
                .replaceAll("'", "&H39");
    }
}
