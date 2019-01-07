package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class CommonAPI {


public WebDriver driver = null;

@BeforeMethod
    public void setUP(){
    System.setProperty("webdriver.chrome.driver","/Users/dola/IdeaProjects/SaksFifthAvenue/Generic/Path/chromedriver");
    driver = new ChromeDriver();
    driver.manage();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.navigate().to("https://www.saksfifthavenue.com/Entry.jsp");
}


    //@AfterMethod
//    public void CloseBrowser(){
//     driver.close();
//}





    public void typeOnElementName(String locator, String value){
        driver.findElement(By.name(locator)).sendKeys(value);
    }
    public void typeOnElementID(String locator, String value){
        driver.findElement(By.id(locator)).sendKeys(value);
    }

    public void typeOnElementcss(String locator, String value){
        driver.findElement(By.cssSelector(locator)).sendKeys(value);
    }

    public void typeOnElement(String locator, String value){
        try{
            driver.findElement(By.name(locator)).sendKeys(value, Keys.ENTER);
        }
        catch(Exception ex1){

        }
        try{
            driver.findElement(By.id(locator)).sendKeys(value, Keys.ENTER);
        }
        catch(Exception ex2){

        }

        try{
            driver.findElement(By.cssSelector(locator)).sendKeys(value, Keys.ENTER);
        }
        catch(Exception ex3){

        }
    }
    public void navigateBack(){
        driver.navigate().back();
}
}
