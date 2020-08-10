package runnerTest.webPages;

import Utils.BasePage;
import org.apache.commons.collections.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainPage  extends  ElementUtil{
    //WebDriver driver;


    By today = By.xpath("//span[contains(text(),'Today')]");
	By lowestTempr = By.xpath("//span[ @class='minTemp']");
	By highestTempr = By.xpath("//span[@class='maxTemp']");

    By tempListInspect = By.xpath("(//div[@class='temps'] )[2] //span//span");


    public void  getDarkSkyPageTitle(){
     System.out.println("title is");

    }
    public ArrayList<Integer> clickOnTodayAndgetTempList() throws InterruptedException {
       // scrollByElement(today);
          scrollTo();
        //scrollDownWithIterator();
         try {
             clickOn(today);
         } catch (Exception e) {
             e.printStackTrace();
         }
         Thread.sleep(5000);
        List<WebElement> tempList = webElements(tempListInspect);
       // List<WebElement> tempList = BasePage.get().findElements(tempListInspect);
        ArrayList<Integer> TempInt = new ArrayList<Integer>();

        for (WebElement webElement : tempList) {
            //String tempList1 = tempList.get(i).getText();
            //String tempList1 = webElement.getText().substring(0,2);
            String tempList1 = webElement.getText().replaceAll("[^0-9]", "");
           // String TempString = tempList1.replaceAll("[^0-9]", "");
            TempInt.add(Integer.parseInt(tempList1));
        }

        return TempInt;
    }

    public int maxTemp() throws InterruptedException {

        ArrayList<Integer> tempIntMax=clickOnTodayAndgetTempList();
        System.out.println("Highest temprature is:::::");
        Thread.sleep(3000);
        return Collections.max(tempIntMax);

    }

    public int minTemp() throws InterruptedException {
        ArrayList<Integer> tempIntMin= clickOnTodayAndgetTempList();
        System.out.println("Lowest temprature is:::::");
        Thread.sleep(3000);
        return Collections.min(tempIntMin);

    }

    public boolean ActualMintemp() throws InterruptedException {


        String text=getTextFromElement(lowestTempr);
        //String TextString = text.substring(0,3);
        String TextString = text.replaceAll("[^0-9]","");
        //return Integer.parseInt(TextString);
        int result=Integer.parseInt(TextString);
        if(result==minTemp()){
            return true;

        }
        return false;
    }

    public boolean ActualMaxtemp() throws InterruptedException {

        String text1= getTextFromElement(highestTempr);
        //String TextString = text.substring(0,2);
        System.out.println("text***************************"+ text1);
        String TextString1 = text1.replaceAll("[^0-9]", "");

        int result1= Integer.parseInt(TextString1);
        if(result1==maxTemp()){
            return true;

        }
        return false;
    }
















}
