package runnerTest.webPages;

import org.openqa.selenium.By;

public class RegisterPage extends ElementUtil{

   //Locators
   By darkSkyAPI=By.xpath("//a[contains(text(),'Dark Sky API')]");
   By loginUp=By.xpath("//a[@class='button']");
   By email=By.id("email");
   By password=By.id("password");
   By loginDown=By.xpath(" //button[text()='Log in']");
   By errormessage=By.xpath(" //div[@class='error']");

   public void clickOnLogin() throws InterruptedException {
       clickOn(darkSkyAPI);
       wait(10);
       clickOn(loginUp);

   }

   public void enterEmail(String emailValue)  {

      sendValue(email,emailValue);

    }

    public void enterPassword(String passwordValue){

     sendValue(password,passwordValue);

}

     public String getErrormessage(){
    return getTextFromElement(errormessage) ;


}







}
