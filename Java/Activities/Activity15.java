package Activities;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;

public class Activity15 {
    public static String FILE_NAME= "TestSheet.xlsx";

    public static void main(String []args) throws IOException {
        XSSFWorkbook workbook= new XSSFWorkbook();
        XSSFSheet sheet=workbook.createSheet( "Datatype in JAVA");
        Object[][] datatype = {
                {"Datatype","Type","Size(In Bytes)"},
                {"int" ,"primitive",2},
                {"float", "primitive", 4},
                {"Char", "primitive","No fix size"}
        };
    }
}
