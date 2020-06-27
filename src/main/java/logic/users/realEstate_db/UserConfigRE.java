package logic.users.realEstate_db;

import com.google.gson.Gson;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import logic.users.example.UserConfig;
import logic.users.example.common.FileManager;
import lombok.Data;

import java.io.File;

@Data

public class UserConfigRE {



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


    public UserConfigRE() {
    }

    public UserConfigRE(String user, String password, String host, String db, String port) {
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

        String filePath = "C:\\Users\\irina\\IdeaProjects\\gitTestProject\\src\\main\\resources";
        String fileName = "REconfEXDB.txt";

        FileManager.writeFile(new File(filePath, fileName),
                new Gson().toJson(new UserConfigRE("u401146528_KI05",
                        "6TOhC;Em",
                        "sql222.main-hosting.eu",
                        "u401146528_KI05",
                        "3306"), UserConfigRE.class));


    }

}
