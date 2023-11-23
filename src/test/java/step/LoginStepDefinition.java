package step;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.BasePage;
import page.DashboardPage;
import page.LoginPage;
import page.NewAccountPage;

public class LoginStepDefinition {
	WebDriver driver;
	LoginPage loginPage;
	DashboardPage dashboardPage;
	NewAccountPage newAccountPage;

	public void beforeRun() {
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		newAccountPage = PageFactory.initElements(driver, NewAccountPage.class);
	}

	@Given("User is on the techfios login page")
	public void user_is_on_the_techfios_login_page() {
		driver = BasePage.setup();
	}

	@When("User enters the {string} in the {string} field")
	public void user_enters_the_in_the_field(String value, String field) {
		switch (field) {
		case "username":
			beforeRun();
			loginPage.insertUserName(value);
			break;
		case "password":
			loginPage.insertPassword(value);
			break;
		}
	}

	@When("User clicks on {string}")
	public void user_clicks_on_login(String field) {
		switch (field) {
		case "login":
			loginPage.clickLoginButton();
			break;
		case "bankCash":
			dashboardPage.clickOnBankCash();
			break;
		case "newAccount":
			dashboardPage.clickOnNewAccount();
			break;
		case "submit":
			newAccountPage.clickSubmitButton();
			break;
		}
	}

	@Then("User should land on Dashboard page")
	public void user_should_land_on_Dashboard_page() {
		dashboardPage.verifyDashboard();

	}

	@Then("User enters {string} in the {string} field in accounts page")
	public void user_enters_in_the_field_in_accounts_page(String value, String field) {
		switch (field) {

		case "accountTitle":
			newAccountPage.insertAccountTitle(value + BasePage.generateRandomNum(999));
			break;
		case "description":
			newAccountPage.insertDescription(value + BasePage.generateRandomNum(999));
			break;
		case "initialBalance":
			newAccountPage.insertBalance(value + BasePage.generateRandomNum(999));
			break;
		case "accountNumber":
			newAccountPage.insertAccountNumber(value + BasePage.generateRandomNum(999));
			break;
		case "contactPerson":
			newAccountPage.insertContactPerson(value + BasePage.generateRandomNum(999));
			break;
		case "Phone":
			newAccountPage.insertPhone(value + BasePage.generateRandomNum(999));
			break;

		}
	}

	@Then("User should be able to validate account created successfully")
	public void user_should_be_able_to_validate_account_created_successfully() {
		newAccountPage.validateAccountCreated();
		BasePage.scrollToBottom();
		BasePage.takeScrnShot(driver);
		afterRun();
	}

	public void afterRun() {
		BasePage.tearDown();
	}

}
