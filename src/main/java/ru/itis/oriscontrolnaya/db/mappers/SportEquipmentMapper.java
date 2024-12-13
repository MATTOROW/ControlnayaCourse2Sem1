package ru.itis.oriscontrolnaya.db.mappers;

import ru.itis.oriscontrolnaya.models.SportEquipment;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SportEquipmentMapper {
    public SportEquipment mapRow(ResultSet resultSet) {
        try {
            SportEquipment equip = new SportEquipment(
                    resultSet.getLong("id"),
                    resultSet.getString("name"),
                    resultSet.getString("params"),
                    resultSet.getInt("age"),
                    resultSet.getString("conditions")
                    );
            return equip;
        } catch (SQLException e) {
            return null;
        }
    }
}
