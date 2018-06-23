package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/checkbox")
public class CheckboxServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding(StandardCharsets.UTF_8.name());
        String checkbox = request.getParameter("checkbox");
        String[] checkboxes = request.getParameterValues("checkboxes");

        response.setContentType("text/html");
        response.setCharacterEncoding(StandardCharsets.UTF_8.name());
        try (PrintWriter out = response.getWriter()) {
            out.println("<html><head><meta charset=\"utf-8\"></head><body>");
            out.println("checkbox=" + checkbox + "<br>");
            if (checkboxes != null) {
                out.println("checkboxes=" + String.join(",", checkboxes));

            } else {
                out.println("checkboxes=パラメータなし");
            }
            out.println("</body></html>");
        }
    }
}
