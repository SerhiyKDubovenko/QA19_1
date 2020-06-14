package logic.users.example.dao;

import logic.users.example.ConnectionManager;

import java.io.File;
import java.sql.Connection;

public class BaseDAO {

    Connection connection = ConnectionManager.getConnection(new File("C:\\Users\\User\\IdeaProjects\\QA19_1\\src\\main\\java\\resources\\confEXDB.txt"));

}
