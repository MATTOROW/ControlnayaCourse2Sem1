package ru.itis.oriscontrolnaya.controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import ru.itis.oriscontrolnaya.services.SportEquipmentService;

import java.io.IOException;

@WebServlet("")
public class ListEquipmentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        SportEquipmentService service = new SportEquipmentService();
        req.setAttribute("equipment", service.getAll());

        req.getRequestDispatcher("/WEB-INF/views/main.jsp").forward(req, resp);

    }
}
