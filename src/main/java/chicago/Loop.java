package chicago;


public class Loop {
    private static int count;
    private static String[] stops = new String[]{"Washington",
            "Monroe", "Jackson", "LaSalle"};

    public static void main(String[] args) {
        while (count < stops.length) {
            if (stops[count++].length() < 8) {
                System.out.println("inside loop   i = : " + count);
            }
            System.out.println("outside loop    i = : " + count);
        }
        System.out.println(count);
    }
}
