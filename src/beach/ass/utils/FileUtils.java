package beach.ass.utils;

import java.io.*;
import java.util.Scanner;

public class FileUtils {
    public static String readFromInputStream(String pathname)
            throws IOException {
        StringBuilder resultStringBuilder = new StringBuilder();
        File file = new File(pathname);
        Scanner reader = new Scanner(file);
        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            resultStringBuilder.append(line).append("\n");
        }
        reader.close();
        return resultStringBuilder.toString();
    }
}
