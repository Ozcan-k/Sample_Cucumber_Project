package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.GooglePage;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class GoogleSearchStepDefinitions {
    GooglePage googlePage = new GooglePage();

    @Given("user is on the google page")
    public void user_is_on_the_google_page() {
        Driver.getDriver().get("https://www.google.com/");

    }

    @When("user search for ipone")
    public void user_search_for_ipone() {

        googlePage.searchBox.sendKeys("iphone" + Keys.ENTER);


    }

    @Then("verify the result has iphone")
    public void verify_the_result_has_iphone() {
        String title = Driver.getDriver().getTitle().toLowerCase();
        Assert.assertTrue(title.contains("iphone"));

    }

    @When("user search for tea pot")
    public void user_search_for_tea_pot() {
        googlePage.searchBox.sendKeys("tea pot" + Keys.ENTER);
    }

    @Then("verify the result has tea pot")
    public void verify_the_result_has_tea_pot() {
        String title = Driver.getDriver().getTitle().toLowerCase();
        Assert.assertTrue(title.contains("tea pot"));
    }


    @When("user search for flower")
    public void user_search_for_flower() {
        googlePage.searchBox.sendKeys("flower" + Keys.ENTER);

    }

    @Then("verify the result has flower")
    public void verify_the_result_has_flower() {
        String title = Driver.getDriver().getTitle().toLowerCase();
        Assert.assertTrue(title.contains("flower"));
    }


    @When("user search for bmw")
    public void user_search_for_bmw() {
        googlePage.searchBox.sendKeys("bmw" + Keys.ENTER);

    }

    @Then("verify the result has bmw")
    public void verify_the_result_has_bmw() {
        String title = Driver.getDriver().getTitle();
        Assert.assertTrue(title.contains("bmw"));

    }


    @Given("user search for {string}")
    public void user_search_for(String string) {
       googlePage.searchBox.sendKeys(string +Keys.ENTER);
    }

    @Then("verify the result has {string}")
    public void verify_the_result_has(String string) {
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      String title= Driver.getDriver().getTitle().toLowerCase();
      Assert.assertTrue(title.contains(string));
    }




}