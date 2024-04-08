package pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class registerpage {
	ChromeDriver driver;
	@BeforeTest
	public void set()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input")).sendKeys("anu");
		driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]")).sendKeys("567539");
		driver.findElement(By.xpath("//*[@id=\"newpasswd\"]")).sendKeys("abc123");
		driver.findElement(By.xpath("//*[@id=\"newpasswd1\"]")).sendKeys("abc123");
		driver.findElement(By.xpath("//*[@id=\"div_altemail\"]/table/tbody/tr[1]/td[3]/input")).sendKeys("anu123@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"mobno\"]")).sendKeys("8976543876");
		driver.findElement(By.xpath("//*[@id=\"country\"]"));
		driver.findElement(By.xpath("//*[@id=\"div_city\"]/table/tbody/tr[1]/td[3]/select"));
		driver.findElement(By.xpath("//*[@id=\"Register\"]")).click();
	}
}
