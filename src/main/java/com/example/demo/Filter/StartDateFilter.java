package com.example.demo.Filter;

import javax.servlet.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebFilter(filterName = "StartDateFilter")
public class StartDateFilter implements Filter {
    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        writer.println("<html><body>");
        String startDate  = request.getParameter("Start date of stay  ");
        if (startDate.matches("1[34][0-9][0-9]\\/((0[1-6]\\/((3[0-1])|([1-2][0-9])|(0[1-9])))|((1[0-2]|(0[7-9]))\\/(30|([1-2][0-9])|(0[1-9]))))")) {
            chain.doFilter(request, response);
        } else {
            writer.println("Start date is incorrect");
            request.getRequestDispatcher("index.jsp").include(request, response);
        }
        writer.println("</body></html>");
        writer.close();
    }
}
