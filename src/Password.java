import org.apache.commons.text.RandomStringGenerator;

public class Password {
    public static String generate(int length) {
        RandomStringGenerator pwdGenerator = new RandomStringGenerator.Builder().withinRange(48, 90)
                .build();
        return pwdGenerator.generate(length);
    }
}
