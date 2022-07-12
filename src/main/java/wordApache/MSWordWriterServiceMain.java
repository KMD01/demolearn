package wordApache;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import java.io.IOException;
import java.net.URISyntaxException;

public class MSWordWriterServiceMain {

    public static void main(String[] args) throws IOException, URISyntaxException, InvalidFormatException {
        MSWordWriterService msWordWriterService = new MSWordWriterService();
        msWordWriterService.createWord();
    }
}
