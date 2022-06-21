package services;

public class FileTxtServiceMain {

    public static void main(String[] args) {

        String name = "anna";
        String text = "anna with alice and julie";

        FileTxtService fileTxtService = new FileTxtService();
        fileTxtService.addFile(name);
        fileTxtService.addText(name,text);
        fileTxtService.readText(name);
        //fileTxtService.deleteFile(name);

    }
}
