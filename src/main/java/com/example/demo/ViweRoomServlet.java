package com.example.demo;

import com.example.demo.service.RoomReservationDao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ViweRoomServlet", value = "/ViweRoomServlet")
public class ViweRoomServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RoomReservationDao roomReservationDao=new RoomReservationDao();
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        String nationalCode = request.getParameter("nationalCode");
        writer.println(roomReservationDao.View(nationalCode));
        writer.println("</body></html>");
        writer.close();
    }
}
