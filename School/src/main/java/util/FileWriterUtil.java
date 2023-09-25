package util;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class FileWriterUtil {
    public String register(String username, String password) {
        FileReaderUtil fileReaderUtil = new FileReaderUtil();
        try {
            FileWriter fileWriter = new FileWriter("register.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String[] strings = fileReaderUtil.login(username);
            if (strings[0] == null) {
                String value = username + " " + password;
                bufferedWriter.newLine();
                bufferedWriter.write(username + password);
            }
            else {
                return "username already exists";
            }

            bufferedWriter.close();
        } catch (Exception e) {
            return "System Eror";
        }
        return "succesfully";
    }

    public String write(String value) {
         try {
            FileWriter fileWriter = new FileWriter("DataCollect.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
             bufferedWriter.newLine();
             bufferedWriter.write(value);
             bufferedWriter.close();
        } catch (Exception e) {
            return "System Eror";
        }
        return "succesfully";
    }
}
