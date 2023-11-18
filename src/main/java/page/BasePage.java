package page;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class BasePage {
	static WebDriver driver;
	static String url;

	public static WebDriver setup() {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.techfios.com/billing/?ng=admin/");

		return driver;
	}
	
	public static void tearDown() {
		driver.close();
		driver.quit();
		
	}
	public static void takeScrnShot(WebDriver driver) {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
		SimpleDateFormat simpleDate = new SimpleDateFormat("MMddyy_HHmmss");
		Date date = new Date();
		String label = simpleDate.format(date);
		try {
			FileUtils.copyFile(sourceFile, new File(System.getProperty("user.dir") + "\\screenshot\\" + label + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static int generateRandomNum(int boundryNum) {
		Random rnd = new Random();
		int generatedNum = rnd.nextInt(boundryNum);
		return generatedNum;
	}
	
	public static void scrollToBottom() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

}
