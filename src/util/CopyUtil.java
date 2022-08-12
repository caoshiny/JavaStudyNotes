package util;

import java.io.*;
import java.util.Arrays;

public class CopyUtil {
    public static void main(String[] args) throws IOException {
        //输入流
        InputStream in = new FileInputStream("C:\\Users\\USER\\Desktop\\1.png_");
        //输出流
        OutputStream out = new FileOutputStream("C:\\Users\\USER\\Desktop\\1.png", true);
        try {
            byte[] buffer = new byte[1024];
            System.out.println(Arrays.toString(buffer));
            while (true) {
                int byteRead = in.read(buffer);
                if (byteRead == -1)
                    break;
                out.write(buffer, 0, byteRead);
            }
        } catch (IOException ex) {
            System.err.println(args[0] + " is not a URL Java understands.");
        } finally {
            in.close();
            out.close();
        }
    }
}
