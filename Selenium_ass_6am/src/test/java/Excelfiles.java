import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Excelfiles {

	public static void main(String[] args) throws Exception {
		
		FileInputStream f9 = new FileInputStream(".\\src\\test\\resources\\assignmentexcelfile");
		Workbook ex = new XSSFWorkbook(f9);
		
		Sheet a = ex.getSheet("facebook");
		
		Row m = a.getRow(0);
		Cell n =m.getCell(0);
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(n.getStringCellValue());

	}

}
