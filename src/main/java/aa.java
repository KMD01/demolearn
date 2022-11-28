import java.util.Locale;

public class aa {
    public static void main(String[] args) {

        String data = "Java";
        int result = 0;
        for (int x = 0; x < data.length(); x++) {
            result += data.toLowerCase(Locale.ROOT).charAt(0);
        }
        System.out.println(result);

    }
}