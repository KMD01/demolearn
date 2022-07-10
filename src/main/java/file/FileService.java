package file;

import java.io.*;
import java.util.Scanner;

public class FileService {

    public void addFile(String fileName){
        try {
            File file = new File("E:\\_projects\\demolearn\\src\\main\\resources" + fileName + ".txt");
        } catch (Exception e){
            System.out.println("An error occured, while adding a file.");
        }
    }

    public void addText(String fileName, String text ){
        try {
            String filePath = "E:\\_projects\\demolearn\\src\\main\\resources\\" + fileName + ".txt";
            File file = new File(filePath);
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(text);
            fileWriter.close();
            System.out.println("Status: file created");
        } catch (IOException e){
            System.out.println("An error occured, while adding a text.");
        }
    }

    public void readText(String fileName){
        try {
            String filePath = "E:\\_projects\\demolearn\\src\\main\\resources\\" + fileName + ".txt";
            File file = new File(filePath);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String textPrint2 = bufferedReader.readLine();

            Scanner scanner = new Scanner(file);

            String textPrint = scanner.nextLine();
            System.out.println("Status: " + "the text from " + file.getName() + " was read" );
            System.out.println("Text from the file: " + textPrint2);
        } catch(IOException e){
            System.out.println("An error occured, while reading a text from file.");}
    }

    public void deleteFile(String fileName){
        String filePath = "E:\\_projects\\demolearn\\src\\main\\resources\\" + fileName + ".txt";
        File file = new File(filePath);
        file.delete();
        System.out.println("Status: " + "the file "+ file.getName() + " was deleted");
    }
}
