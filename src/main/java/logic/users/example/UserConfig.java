package logic.users.example;

import com.google.gson.Gson;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import logic.users.example.common.FileManager;
import lombok.Data;

import java.io.File;

@Data
public class UserConfig {


    @SerializedName("user")
    @Expose
    private String user;

    @SerializedName("password")
    @Expose
    private String password;

    @SerializedName("host")
    @Expose
    private String host;

    @SerializedName("db")
    @Expose
    private String db;

    @SerializedName("port")
    @Expose
    private String port;


    public UserConfig() {
    }

    public UserConfig(String user, String password, String host, String db, String port) {
        this.user = user;
        this.password = password;
        this.host = host;
        this.db = db;
        this.port = port;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public static void main(String[] args) {


        String filePath = "C:\\Users\\User\\IdeaProjects\\QA19_1\\src\\main\\java\\resources";
        String fileName = "YKconfEXDB.txt";

        FileManager.writeFile(new File(filePath, fileName),
                new Gson().toJson(new UserConfig("u401146528_EX",
                        "/fIE/mi&",
                        "sql222.main-hosting.eu",
                        "u401146528_EX",
                        "3306"), UserConfig.class));


    }

}
