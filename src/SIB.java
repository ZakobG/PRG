import java.io.*;

public class SIB {
    public static void main(String[] args) throws Exception {

        FileReader fr = new FileReader(
                "C:\\Users\\Name\\Downloads\\slova.txt");
        int i;
        while ((i = fr.read()) != -1)
            System.out.print((char) i);

    }
}
