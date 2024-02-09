package task;

import java.io.*;

public class UserInfoFileManager  {
    public void creatInfoManager(User userlist) {
        File file = new File("File.txt");
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            bufferedWriter.write(userlist.toString());
            bufferedWriter.close();
            System.out.println("Файл записан!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}



