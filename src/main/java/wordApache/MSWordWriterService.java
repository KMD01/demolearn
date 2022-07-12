package wordApache;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xwpf.usermodel.*;

import java.io.*;
import java.net.URISyntaxException;

public class MSWordWriterService {

    public static String logo = "photo.jpeg";
    public static String myText = "opis.txt";

    public void createWord() throws IOException, URISyntaxException, InvalidFormatException {
        XWPFDocument document = new XWPFDocument();
        makeHeader(document,"Come on! Look at the word document.");
        makeText(document);
        saveWord(document);
    }

    private void makeHeader(XWPFDocument document, String title_name){
        XWPFParagraph paragraphTitle = document.createParagraph();
        paragraphTitle.setAlignment(ParagraphAlignment.CENTER);

        XWPFRun paragraphTitleRun = paragraphTitle.createRun();
        paragraphTitleRun.setText(title_name);
        paragraphTitleRun.setBold(true);
        paragraphTitleRun.setFontFamily("Arial");
        paragraphTitleRun.setFontSize(20);
    }

    private void makeText(XWPFDocument document) throws FileNotFoundException {
        XWPFParagraph paragraphText = document.createParagraph();
        paragraphText.setAlignment(ParagraphAlignment.LEFT);
        XWPFRun paragraphTextRun = paragraphText.createRun();
        FileReader fileReader = new FileReader("opis.txt");
        String exportText = fileReader.toString();
        paragraphTextRun.setText(myText);
    }

    private void saveWord(XWPFDocument document) throws IOException {
        File file = new File("D:/newDocument.docx");
        file.delete();
        file.createNewFile();
        FileOutputStream out = new FileOutputStream(file);
        document.write(out);
        out.close();
    }

}
