package ru.itis.oriscontrolnaya.controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import ru.itis.oriscontrolnaya.models.SportEquipment;
import ru.itis.oriscontrolnaya.services.SportEquipmentService;

import java.io.IOException;

@WebServlet("/info/*")
public class InfoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        SportEquipmentService service = new SportEquipmentService();
        String id = req.getPathInfo().replace("/", "");
        SportEquipment equipment;
        try {
            long idLong = Long.parseLong(id);
            equipment = service.getEquipmentById(idLong);
        } catch (NumberFormatException e) {
            equipment = new SportEquipment("Не найдено", "Не найдено", -1, "Не найдено");
            equipment.setId(-1);
        }
        req.setAttribute("equipment", equipment);
        req.getRequestDispatcher("/WEB-INF/views/info.jsp").forward(req, resp);

    }
}
