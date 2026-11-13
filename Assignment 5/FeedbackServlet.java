package com.example;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;
import java.time.LocalDateTime;

public class FeedbackServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String type = request.getParameter("type");
        String comments = request.getParameter("comments");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2>Thank you, " + name +
                " for your feedback!</h2>");
        out.println("<p>Email: " + email + "</p>");
        out.println("<p>Feedback Type: " + type + "</p>");
        out.println("<p>Comments: " + comments + "</p>");
        out.println("<p>Date and Time: " +
                LocalDateTime.now() + "</p>");
        out.println("</body></html>");
    }
}
