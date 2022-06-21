package services;

import com.poiji.bind.Poiji;

import java.io.File;
import java.util.List;

public class InvoiceExcelMain {

    public static void main(String[] args)  {
        try {
            File file = new File("E:/ExcelKris.xlsx");
            List<InvoiceExcel> invoices = Poiji.fromExcel(file, InvoiceExcel.class);
            System.out.println("Printing List Data: " + invoices);
        }
        catch (Exception e){
            System.out.println("Shock! there is a ERROR!!");;
        }


    }

}
