package file;

import java.io.*;
import java.util.Scanner;

public class FileService {

    private final String PATH_NAME = "D:\\DEVELOPER\\_projects\\demolearn\\src\\main\\resources\\";

    public FileWriter createFile(String fileName) throws IOException {
        String filePath = PATH_NAME + fileName + ".txt";
        File file = new File(filePath);
        return new FileWriter(file);
    }

    public void addText(String fileName, String text, FileWriter fileWriter) {
        try {
            String filePath = PATH_NAME + fileName + ".txt";
            File file = new File(filePath);
            fileWriter.write(text);
            fileWriter.close();
            System.out.println("Status: file created");
        } catch (IOException e) {
            System.out.println("An error occurred, while adding a text.");
        }
    }

    public void readText(String fileName) {
        try {
            String filePath = PATH_NAME + fileName + ".txt";
            File file = new File(filePath);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String textPrint1 = bufferedReader.readLine();
            Scanner scanner = new Scanner(file);
            String textPrint2 = scanner.nextLine();
            System.out.println("Status: " + "the text from " + file.getName() + " was read");
            System.out.println("Text from the file via BufferReader: " + textPrint1);
            System.out.println("Text from the file via Scanner: " + textPrint2);
        } catch (IOException e) {
            System.out.println("An error occurred, while reading a text from file.");
        }
    }

    public void deleteFile(String fileName) {
        String filePath = "D:\\DEVELOPER\\_projects\\demolearn\\src\\main\\resources\\" + fileName + ".txt";
        File file = new File(filePath);
        file.delete();
        System.out.println("Status: " + "the file " + file.getName() + " was deleted");
    }
}
