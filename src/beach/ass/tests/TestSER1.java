package beach.ass.tests;

import java.io.IOException;
import java.io.InputStream;

import static beach.ass.utils.FileUtils.readFromInputStream;

public class TestSER1 {
    public static void test() {
        try {
            String data = readFromInputStream("src/beach/ass/res/data.csv");
            System.out.println(data.split("\n")[1]);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
