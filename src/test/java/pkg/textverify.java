package pkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class textverify {
	ChromeDriver driver;
	@BeforeTest
	public void set()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void buttontextverify()
		{
			WebElement dayelement=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
			Select day=new Select(dayelement);
			day.selectByValue("06");

			WebElement monthelement=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
			Select M=new Select(monthelement);
			M.selectByIndex(2);
			
			WebElement year=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
			Select Y=new Select(year);
			Y.selectByVisibleText("2000");
			
			List<WebElement>li=day.getOptions();
			System.out.println(li.size());
			List<WebElement>li1=M.getOptions();
			System.out.println(li1.size());
			List<WebElement>li2=day.getOptions();
			System.out.println(li2.size());
		}
}
