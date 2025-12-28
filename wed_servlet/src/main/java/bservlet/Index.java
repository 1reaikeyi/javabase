package bservlet;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;
import java.io.PrintWriter;
@WebServlet(urlPatterns = "/index", loadOnStartup = 1)
public class Index implements Servlet {
    public Index() {
        System.out.println("1,创建index对象"+this);
    }

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        servletResponse.setContentType("text/html;charset=UTF-8");

        System.out.println("运行成功");
        System.out.println("--------------------");
        String name = servletRequest.getParameter("id");
        PrintWriter out = servletResponse.getWriter();
        System.out.println(name);
        if("id".equals(name)){
            out.println("ok");
            System.out.println("参数正确");
        }else{
            out.println("参数错误"+name);
            System.out.println("参数错误"+name);
        }
        out.close();
    }



    @Override
    public String getServletInfo() {
        return "";
    }

    @Override
    public void destroy() {
        System.out.println("摧毁:"+this);

    }
}
