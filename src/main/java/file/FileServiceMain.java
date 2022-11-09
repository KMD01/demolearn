package file;

import java.io.FileWriter;
import java.io.IOException;

public class FileServiceMain {

    public static void main(String[] args) throws IOException {

        String name = "anna";
        String text = "anna with alice and julie";

        FileService fileService = new FileService();
        FileWriter fw = fileService.createFile(name);
        fileService.addText(name, text, fw);
        fileService.readText(name);
        //fileTxtService.deleteFile(name);

    }
}
