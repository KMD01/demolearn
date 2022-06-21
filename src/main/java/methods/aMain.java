package methods;

import custom.Car;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.time.LocalDate;

public class aMain {
    public static void main(String[] args) {

        LocalDate start = LocalDate.now();
        LocalDate end = start.plusDays(3);

        TimeMethod timeMethod = new TimeMethod();
        timeMethod.showDuration(start,end);






        //String firstNameAndLastName = " Kris Kross ";
        //StripMethod.useStripMethod(firstNameAndLastName);
        //System.out.println(firstNameAndLastName);

        //Nullable method
        //Car car = new Car();
        //car.setColor(null);
        //System.out.println(car.getColor());
        //System.out.println(NullableMethod.checkIfCarHaveColor(car));

        //AnyMatchMethod.matchElement();
        //FileMethod fileMethod = new FileMethod();
        //String fileName = "FileKris";
        /*fileMethod.addFile(fileName);
        fileMethod.addText(fileName,"hej ho");
        fileMethod.readText(fileName);*/
        //fileMethod.deleteFile(fileName);






    }
}
