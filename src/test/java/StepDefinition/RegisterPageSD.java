package StepDefinition;

import Utils.BasePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import runnerTest.webPages.RegisterPage;

public class RegisterPageSD {

  private RegisterPage registerPage = new RegisterPage();


  @Given("^I am on the Darksky Register page$")
  public void setRegisterPage() throws InterruptedException {
    registerPage.clickOnLogin();
    Assert.assertEquals(BasePage.get().getCurrentUrl(), "https://darksky.net/dev/login");

  }

  @When("^I enter (.+) into (email|password) text fields on login page$")

  public void enterDataIntoTextField(String value, String textField) {
      switch (textField) {
      case "username":
        registerPage.enterEmail(value);
        break;
      case "password":
        registerPage.enterPassword(value);
    }
  }
 // I click on login button on messenger page
  @And("^I click on login button$")
  public void clickOnLoginButton() throws InterruptedException {
   registerPage.clickOnLogin();
  }

  @Then("^I verify error message “password and username does not match”$")
  public void verifySignInErrorMessage() {

    Assert.assertEquals(registerPage.getErrormessage(), "password and username does not match");

  }


}