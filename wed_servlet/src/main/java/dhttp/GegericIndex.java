package dhttp;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.PrintWriter;

public class GegericIndex extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        PrintWriter out = servletResponse.getWriter();
    }

    private void doPost(HttpServletRequest request, ServletResponse servletResponse) {
        System.out.println("public class GegericIndex extends GenericServlet收到post method");
    }

    private void doGet(HttpServletRequest request, ServletResponse servletResponse) {
        System.out.println("public class GegericIndex extends GenericServlet收到get method");
    }
}
