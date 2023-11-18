package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DashboardPage{
	
	WebDriver driver;
	
	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}
	


	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Bank & Cash')]") WebElement BANKCASH_MENU_ELEMENT;
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'New Account')]") WebElement NEWACCOUNT_MENU_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[3]/ul/li[2]/a") WebElement LIST_CUSTOMER_MENU_ELEMENT;
	


	
	public void clickOnBankCash() throws InterruptedException {
		Thread.sleep(1000);
		BANKCASH_MENU_ELEMENT.click();
	}
	
	public void clickOnNewAccount() {
		NEWACCOUNT_MENU_ELEMENT.click();
	}
	
	public void clickOnListCustomerMenuButton() throws InterruptedException {
		Thread.sleep(2000);
		LIST_CUSTOMER_MENU_ELEMENT.click();
	}
	
	

}
