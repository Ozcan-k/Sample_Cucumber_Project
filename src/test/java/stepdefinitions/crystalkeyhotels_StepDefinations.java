package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.crystalkeyhotels;
import utilities.ConfigReader;
import utilities.Driver;

public class crystalkeyhotels_StepDefinations {
    crystalkeyhotels hotel=new crystalkeyhotels();

    @When("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigReader.getProperty("hotelloginPage_url"));

    }

    @When("user enter invalid username {string}")
    public void user_enter_valid_username(String string) {
        hotel.usernameBox.sendKeys(string );

    }

    @When("user enter invalid password {string}")
    public void user_enter_valid_password(String string) {
    hotel.passwordBox.sendKeys(string  );
    }

    @When("click the login button")
    public void click_the_login_button() {
        hotel.submitButton.click();

    }
    @Then("verify error message")
    public void verify_error_message() {
        String message=hotel.errorMessage.getText();
        Assert.assertTrue(message.contains("Try again please"));

    }

    @Given("enter valid username")
    public void enter_valid_username() {

        hotel.usernameBox.sendKeys("manager");
    }

    @Given("enter valid password")
    public void enter_valid_password() {
        hotel.passwordBox.sendKeys("Manager1!");

    }

    @Then("click login button")
    public void click_login_button() {
        hotel.submitButton.click();

    }



}
