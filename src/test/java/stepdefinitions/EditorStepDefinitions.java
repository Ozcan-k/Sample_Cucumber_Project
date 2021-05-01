package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.EditorPage;
import utilities.Driver;

public class EditorStepDefinitions {
  EditorPage editorPage=new EditorPage();
    @When("user is on the editor page")
    public void user_is_on_the_editor_page() {

        Driver.getDriver().get("https://editor.datatables.net/");
    }

    @When("user click on the new button")
    public void user_click_on_the_new_button() {
        editorPage.newButton.click();
    }

    @When("search for the first name")
    public void search_for_the_first_name() {
        editorPage.firstName.sendKeys("Hakan");

    }

    @When("search for the last name")
    public void search_for_the_last_name() {
        editorPage.lastName.sendKeys("can");

    }

    @When("search for the position")
    public void search_for_the_position() {
   editorPage.position.sendKeys("Sdet");
    }

    @When("search for the office")
    public void search_for_the_office() {
        editorPage.office.sendKeys("Vancouver");

    }

    @When("search for the extension")
    public void search_for_the_extension() {
        editorPage.extension.sendKeys("1234");

    }

    @When("search for the startdate")
    public void search_for_the_startdate() {
    editorPage.startDate.sendKeys("2021-03-01");
    }

    @When("search for the salary")
    public void search_for_the_salary() {
        editorPage.salary.sendKeys("110000");

    }

    @When("user click on the create button")
    public void user_click_on_the_create_button() {
   editorPage.createButton.click();
    }

    @When("user search for the first name")
    public void user_search_for_the_first_name() {
 editorPage.searchBox.sendKeys("Hakan");
    }

    @Then("verify the name fields contains first name")
    public void verify_the_name_fields_contains_first_name() {
       String name=editorPage.nameField.getText();
        Assert.assertTrue(name.contains("Hakan"));

    }
    @When("search for the firstname {string}")
    public void search_for_the_firstname(String string) {
       editorPage.firstName.sendKeys(string);
    }
    @When("search for the  lastname {string}")
    public void search_for_the_lastname(String string) {
        editorPage.lastName.sendKeys(string);
    }

    @When("search for the  position {string}")
    public void search_for_the_position(String string) {
        editorPage.position.sendKeys(string);
    }


    @When("search for the  office {string}")
    public void search_for_the_office(String string) {
        editorPage.office.sendKeys(string);
    }

    @When("search for the  extension {string}")
    public void search_for_the_extension(String string) {
        editorPage.extension.sendKeys(string);
    }

    @When("search for the  startdata {string}")
    public void search_for_the_startdata(String string) {
        editorPage.startDate.sendKeys(string);
    }

    @When("search for the salary {string}")
    public void search_for_the_salary(String string) {
       editorPage.salary.sendKeys(string);
    }

    @When("user search for the firstname {string}")
    public void user_search_for_the_firstname(String string) {
       editorPage.firstName.sendKeys(string);
    }

    @Then("verify the name fields contains firstname {string}")
    public void verify_the_name_fields_contains_firstname(String string) {
       editorPage.firstName.sendKeys(string);
    }






}
