package com.clemente;

import com.clemente.persistence.migration.MigrationStrategy;
import com.clemente.ui.MainMenu;

import java.sql.SQLException;

import static com.clemente.persistence.config.ConnectionConfig.getConnection;


public class Main {

    public static void main(String[] args) throws SQLException {
        try(var connection = getConnection()){
            new MigrationStrategy(connection).executeMigration();
        }
        new MainMenu().execute();
    }

}
