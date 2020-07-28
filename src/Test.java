import javax.print.DocFlavor;
import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
        File file = new File("test.txt");
        InputStream inputStream = new FileInputStream(file);
        Reader reader = new InputStreamReader(inputStream);
        int i = 0;
        while ((i = reader.read()) != -1){
            System.out.print((char) i );
        }
        System.out.println(file.toPath());




    }
}
