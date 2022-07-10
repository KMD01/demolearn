package file;

public class FileServiceMain {

    public static void main(String[] args) {

        String name = "anna";
        String text = "anna with alice and julie";

        FileService fileService = new FileService();
        fileService.addFile(name);
        fileService.addText(name,text);
        fileService.readText(name);
        //fileTxtService.deleteFile(name);

    }
}
