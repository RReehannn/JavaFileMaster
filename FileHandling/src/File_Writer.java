import java.io.FileWriter;
import java.io.IOException;

public class File_Writer {
    public static void main(String[] args){
        String fileName = "RRReehannn.txt";
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write("This is Java Developer, Are you?");
            writer.flush();

        } catch (IOException exception){
            System.out.println(exception.getMessage());
        }

    }
}
