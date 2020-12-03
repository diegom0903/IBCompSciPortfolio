package Project4;

import java.io.File;

public class Main {
    public static void main(String[] args){

    String dir = "C:\\Users\\diegomendoza\\Desktop\\filesDemo\\";

    File myFile = new File(dir+"myFile.csv");
    Parser parser = new Parser(myFile);
    double data = parser.findAverage();

    Writer writer = new Writer(dir+"output.csv");
    writer.writeData(Double.toString(data));

    }
}
