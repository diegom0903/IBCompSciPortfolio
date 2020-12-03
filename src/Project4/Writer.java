package Project4;

import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    private FileWriter fileWriter;

    public Writer(String fileName) {
        try {
            fileWriter = new FileWriter(fileName);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
