package logic.users.db_yk;

import com.google.gson.Gson;
import logic.users.example.UserConfig;
import logic.users.example.common.FileManager;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManagerYK {
    private static Connection connection;

    private static String getConnectionUrl(String host, String dbPort, String dbName){
        return "jdbc:mysql://"+host+":"+dbPort+"/"+dbName;
    }

    public static Connection getConnection(File file){

        if(connection==null){
            UserConfig config = new Gson().fromJson(FileManager.readFile(file), UserConfig.class);
            try {
                connection =  DriverManager
                        .getConnection(getConnectionUrl(config.getHost(), config.getPort(), config.getDb()),
                                config.getUser(), config.getPassword());
            } catch (SQLException sqlex) {
                sqlex.printStackTrace();
            }
        }
        return connection;
    }


}
