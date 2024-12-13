package ru.itis.oriscontrolnaya.services;

import ru.itis.oriscontrolnaya.db.dao.SportEquipmentDAO;
import ru.itis.oriscontrolnaya.models.SportEquipment;

import java.util.List;

public class SportEquipmentService {
    private final SportEquipmentDAO dao = new SportEquipmentDAO();

    public List<SportEquipment> getAll() {
        return dao.getAll();
    }

    public SportEquipment getEquipmentById(Long id) {
        return dao.getById(id);
    }
}
