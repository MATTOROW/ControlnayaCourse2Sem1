package ru.itis.oriscontrolnaya.db.dao;

import ru.itis.oriscontrolnaya.db.DBConnection;
import ru.itis.oriscontrolnaya.db.mappers.SportEquipmentMapper;
import ru.itis.oriscontrolnaya.models.SportEquipment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SportEquipmentDAO {
    private final DBConnection dbController = DBConnection.getDBConnection();
    private final SportEquipmentMapper mapper = new SportEquipmentMapper();

    // language=sql
    private final String SQL_GET_ALL = "SELECT * FROM sports_equipment";

    // language=sql
    private final String SQL_GET_BY_ID = "SELECT * FROM sports_equipment WHERE id = ?";

    public List<SportEquipment> getAll() {
        try {
            Connection connection = dbController.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SQL_GET_ALL);
            ResultSet resultSet = preparedStatement.executeQuery();
            dbController.releaseConnection(connection);
            List<SportEquipment> list = new ArrayList<>();
            while (resultSet.next()) {
                list.add(mapper.mapRow(resultSet));
            }
            return list;
        } catch (SQLException e) {
            return null;
        }
    }

    public SportEquipment getById(Long id) {
        try {
            Connection connection = dbController.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SQL_GET_BY_ID);
            preparedStatement.setLong(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            dbController.releaseConnection(connection);
            return resultSet.next() ? mapper.mapRow(resultSet) : null;
        } catch (SQLException e) {
            return null;
        }
    }
}
