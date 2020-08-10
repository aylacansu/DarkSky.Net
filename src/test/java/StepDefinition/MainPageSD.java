package StepDefinition;

import Utils.BasePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.commons.collections.bag.SynchronizedSortedBag;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import runnerTest.webPages.MainPage;

public class MainPageSD {
SoftAssert softAssert=new SoftAssert();
private MainPage mainPage=new MainPage();

  @Given("^I am on Main Page$")

    public void verifyTitle(){
    mainPage.getDarkSkyPageTitle();
    Assert.assertEquals(BasePage.get().getTitle(),"Dark Sky - Broadway, New York, NY");

  }
@When("^I click on Today button on Main Page$")
public void clickOnToday() throws InterruptedException {

      System.out.println(mainPage.clickOnTodayAndgetTempList());
  }

  @And("^I verify Lowest Tempreture is Displayed Correctly$")
  public void verifyminTemp() throws InterruptedException {

      Thread.sleep(3000);
   //Assert.assertEquals(mainPage.ActualMintemp(),mainPage.minTemp());
   //Assert.assertNotEquals(mainPage.ActualMintemp(),mainPage.minTemp());
  softAssert.assertTrue(mainPage.ActualMintemp());
  }
@And("^I verify Highest Tempreture is Displayed Correctly$")
public void verifymaxTemp() throws InterruptedException {

  Thread.sleep(3000);
  //Assert.assertNotEquals(mainPage.ActualMaxtemp(),mainPage.maxTemp());
    softAssert.assertTrue(mainPage.ActualMaxtemp());

}














}
