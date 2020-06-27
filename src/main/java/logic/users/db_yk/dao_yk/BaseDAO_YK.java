package logic.users.db_yk.dao_yk;

import logic.users.example.ConnectionManager;
import java.io.File;
import java.sql.Connection;

public class BaseDAO_YK {

   Connection connection = ConnectionManager.getConnection(new File("C:\\Users\\User\\IdeaProjects\\QA19_1\\src\\main\\java\\resources\\YKconfEXDB.txt"));

}
