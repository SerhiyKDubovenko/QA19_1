package logic.users.realEstate_db.commonRE;

import java.io.*;

public class FileManagerRE {
    public static void writeFile(File file, String json) {
        try{
            OutputStream os = new FileOutputStream(file);
            os.write(json.getBytes());
            os.flush();
        }catch (FileNotFoundException fnfex){
            fnfex.printStackTrace();
        }catch (IOException ioex){
            ioex.printStackTrace();
        }


    }

    public static String readFile(File file) {
        InputStream is = null;
        String str = "";
        try {
            is = new FileInputStream(file);
            int buf;
            while ((buf = is.read()) > 0) {
                str = str + (char) buf;
            }
        } catch (FileNotFoundException fnfex) {
            fnfex.printStackTrace();
        } catch (IOException fnfex) {
            fnfex.printStackTrace();
        }

        return str;
    }
}
