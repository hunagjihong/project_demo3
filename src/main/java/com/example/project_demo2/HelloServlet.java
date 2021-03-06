package com.example.project_demo2;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("<h1>" + message + "</h1>");
        out.println("<h1>" + message + "</h1>");
        out.println("<h1>hot-fix</h1>");
        out.println("<h1>hot-fix2</h1>");
        out.println("<h1>hot-fix7</h1>");
        out.println("<h1>hot-fix8</h1>");
        out.println("<h1>hot-fix9</h1>");
        out.println("<h1>hot-fix10</h1>");
        out.println("<h1>push test</h1>");
        out.println("<h1>push test2</h1>");   
        out.println("<h1>pull test</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}
