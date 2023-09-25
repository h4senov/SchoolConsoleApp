package util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileReaderUtil {

    public String[] login(String username) throws Exception {
        String[] strings = new String[2];
        FileReader fileReader = new FileReader("register.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String data = bufferedReader.readLine();

        while (data != null) {
            String[] strings1 = data.split(" ");
            if (strings1[0].equals(username)) {
                strings = strings1;
                break;
            }
            try {
                data = bufferedReader.readLine();
            } catch (IOException e) {
                System.out.println("System error");
            }
        }
        return strings;

    }

    public String[] reader() throws Exception {

        FileReader fileReader = new FileReader("DataCollect.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        BufferedReader bufferedReader1 = Files.newBufferedReader(Paths.get("DataCollect.txt"), StandardCharsets.UTF_8);
        int size = bufferedReader1.lines().toArray().length;
        String[] strings = new String[size];
        String data = bufferedReader.readLine();
        int count = 0;
        while (data != null) {
            strings[count] = data;
            count++;
            try {
                data = bufferedReader.readLine();
            } catch (IOException e) {
                System.out.println(" Reader mothodu   System Error");
            }
        }
        return strings;

    }


}

