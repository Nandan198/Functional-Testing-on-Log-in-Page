package FTOnLoginPage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

//By Entering In-Valied Username
public class FT02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" https://demo.dealsdray.com/");
		//Locating and sending keys Username
		driver.findElement(By.id("mui-1")).sendKeys("pre.mis@dealsdray.com");
		
		//Locating and sending Password
		driver.findElement(By.id("mui-2")).sendKeys("prexo.mis@dealsdray.com");
		
		//Adding implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Locating and clicking on Log-in Button
		driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div/form/div[3]/div/button")).click();
		driver.close();
	}

}
