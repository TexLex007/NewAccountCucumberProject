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

	@When("User enters the {string} in the username field")
	public void user_enters_the_in_the_username_field(String userName) {
		beforeRun();
		loginPage.insertUserName(userName);
	}

	@When("User enters the {string} in the password field")
	public void user_enters_the_in_the_password_field(String password) {
		loginPage.insertPassword(password);
	}

	@When("User clicks on login")
	public void user_clicks_on_login() {
		loginPage.clickLoginButton();
	}

	@Then("User should land on Dashboard page")
	public void user_should_land_on_Dashboard_page() {

	}

	@Then("User clicks on bank cash")
	public void user_clicks_on_bank_cash() throws InterruptedException {
		dashboardPage.clickOnBankCash();
	}

	@Then("User clicks on new account")
	public void user_clicks_on_new_account() {
		dashboardPage.clickOnNewAccount();
	}

	@Then("User enters {string} in the account title field in accounts page")
	public void user_enters_in_the_account_title_field_in_accounts_page(String accountTitle) {
		newAccountPage.insertAccountTitle(accountTitle + BasePage.generateRandomNum(999));
	}

	@Then("User enters {string} in the description field in accounts page")
	public void user_enters_in_the_description_field_in_accounts_page(String description) {
		newAccountPage.insertDescription(description + BasePage.generateRandomNum(999));
	}

	@Then("User enters {string} in the initial balance field in accounts page")
	public void user_enters_in_the_initial_balance_field_in_accounts_page(String initialBalance) {
		newAccountPage.insertBalance(initialBalance + BasePage.generateRandomNum(999));
	}

	@Then("User enters {string} in the account number field in accounts page")
	public void user_enters_in_the_account_number_field_in_accounts_page(String accountNumber) {
		newAccountPage.insertAccountNumber(accountNumber + BasePage.generateRandomNum(999));
	}

	@Then("User enters {string} in the contact person field in accounts page")
	public void user_enters_in_the_contact_person_field_in_accounts_page(String contactPerson) {
		newAccountPage.insertContactPerson(contactPerson + BasePage.generateRandomNum(999));
	}

	@Then("User enters {string} in the phone field in accounts page")
	public void user_enters_in_the_phone_field_in_accounts_page(String phone) {
		newAccountPage.insertPhone(phone + BasePage.generateRandomNum(999));
	}

	@Then("User clicks on submit")
	public void user_clicks_on_submit() {
		newAccountPage.clickSubmitButton();
	}

	@Then("User should be able to validate account created successfully")
	public void user_should_be_able_to_validate_account_created_successfully() {
		BasePage.scrollToBottom();
		BasePage.takeScrnShot(driver);
		afterRun();
	}

	public void afterRun() {
		BasePage.tearDown();
	}

}
