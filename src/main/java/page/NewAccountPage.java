package page;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NewAccountPage {
	WebDriver driver;

	public NewAccountPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//input[@id='account']")
	WebElement ACCOUNT_TITLE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='description']")
	WebElement DESCRIPTION_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='balance']")
	WebElement INITIAL_BALANCE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='account_number']")
	WebElement ACCOUNT_NUMBER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='contact_person']")
	WebElement CONTACT_PERSON_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='contact_phone']")
	WebElement PHONE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Submit']") WebElement SUBMIT_BUTTON_ELEMENT;
	@FindBy(how = How.XPATH, using = "//div[@class='alert alert-success fade in']") WebElement VALIDATE_ACCOUNT_CREATED_ELEMENT;
	

	public void insertAccountTitle(String accountTitle) {
		ACCOUNT_TITLE_ELEMENT.sendKeys(accountTitle);
	}

	public void insertDescription(String description) {
		DESCRIPTION_ELEMENT.sendKeys(description);
	}

	public void insertBalance(String balance) {
		INITIAL_BALANCE_ELEMENT.sendKeys(balance);
	}

	public void insertAccountNumber(String accountNumber) {
		ACCOUNT_NUMBER_ELEMENT.sendKeys(accountNumber);
	}

	public void insertContactPerson(String contactPerson) {
		CONTACT_PERSON_ELEMENT.sendKeys(contactPerson);
	}

	public void insertPhone(String phone) {
		PHONE_ELEMENT.sendKeys(phone);
	}
	
	public void clickSubmitButton() {
		SUBMIT_BUTTON_ELEMENT.click();
	}
	
	public void validateAccountCreated() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Assert.assertTrue("Dashboard Page not found",VALIDATE_ACCOUNT_CREATED_ELEMENT.getText().contains("Account Created Successfully"));
	}

}
