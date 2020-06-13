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





    public static void main(String[] args) {

        String filePath = "C:\\Users\\pp\\IdeaProjects\\QA19_1_1\\src\\main\\java\\resources";
        String fileName = "confEXDB.txt";

        FileManager.writeFile(new File(filePath, fileName),
                new Gson().toJson(new UserConfig("u401146528_EX",
                        "/fIE/mi&",
                        "sql222.main-hosting.eu",
                        "u401146528_EX",
                        "3306"), UserConfig.class));


    }

}
