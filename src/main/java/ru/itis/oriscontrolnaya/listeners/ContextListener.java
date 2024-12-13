package ru.itis.oriscontrolnaya.listeners;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;
import org.flywaydb.core.Flyway;
import ru.itis.oriscontrolnaya.db.DBConnection;

@WebListener
public class ContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        DBConnection.getDBConnection().initDB(
                "jdbc:postgresql://localhost:5432/Controlnaya",
                "postgres",
                "cKjdj21637");

        Flyway flyway = Flyway.configure().baselineOnMigrate(true).dataSource(
                "jdbc:postgresql://localhost:5432/Controlnaya",
                "postgres",
                "cKjdj21637").load();

        flyway.migrate();
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        DBConnection.getDBConnection().closeAll();
    }
}
