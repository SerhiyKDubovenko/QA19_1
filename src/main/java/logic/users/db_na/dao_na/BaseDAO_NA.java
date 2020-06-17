package logic.users.db_na.dao_na;

import logic.users.example.ConnectionManager;

import java.io.File;
import java.sql.Connection;

public class BaseDAO_NA {

    Connection connection = ConnectionManager.getConnection(new File("C:\\Users\\User\\IdeaProjects\\QA19_1\\src\\main\\java\\resources\\confEXDB.txt"));

}
