package studyGuide.chapter3_java_api;

public class StringMethods {

    public static void main(String[] args) {

        String name = "John";
        String lastName = "";
        name.length(); //4
        name.charAt(0); // J
        name.indexOf("J"); // 0
        name.substring(0,1);
        name.toLowerCase();
        name.toUpperCase();
        name.equals(lastName);
        name.startsWith("a");
        name.contains("ame");
        name.replace("J", "j");
        name.trim();




    }


}
