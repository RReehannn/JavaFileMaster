import java.io.FileReader;
import java.io.IOException;

public class File_Reader {
    public static void main(String[] args) {
        String fileName = "RRReehannn.txt";

        try {
            FileReader reader = new FileReader(fileName);
            int read = 0;
            do {
                read =  reader.read();
                System.out.print((char) read);

            } while (read != -1);

        } catch (IOException exception){
            System.out.println(exception.getMessage());
        }
    }
}
