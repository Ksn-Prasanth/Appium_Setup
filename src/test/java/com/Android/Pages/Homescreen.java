package com.Android.Pages;
import utils.DriverManager;
import utils.GlobalParams;
import utils.TestUtils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.InteractsWithApps;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


public class Homescreen {
    private AppiumDriver driver;
    
    TestUtils utils = new TestUtils();

    public Homescreen(){
        this.driver = new DriverManager().getDriver();
        PageFactory.initElements(new AppiumFieldDecorator(this.driver), this);
    }
    public void launchApp() throws InterruptedException {
        switch(new GlobalParams().getPlatformName()){
            case "Android":
                ((InteractsWithApps) driver).activateApp(driver.getCapabilities().
                        getCapability("appPackage").toString());
                break;
            case "iOS":
                ((InteractsWithApps) driver).activateApp(driver.getCapabilities().
                        getCapability("bundleId").toString());
        }
        Thread.sleep(5000);
    }
    public void closeApp() throws InterruptedException {
        switch(new GlobalParams().getPlatformName()){
            case "Android":
                ((InteractsWithApps) driver).terminateApp(driver.getCapabilities().
                        getCapability("appPackage").toString());
                Thread.sleep(5000);
                break;
            case "iOS":
                ((InteractsWithApps) driver).terminateApp(driver.getCapabilities().
                        getCapability("bundleId").toString());
        }
    }
    public String firstSting = "";
    public String secondString = "";

    public void test() throws InterruptedException {
        Thread.sleep(10000);
        WebElement button = driver.findElement(By.xpath(firstSting));
        button.click();
        Thread.sleep(5000);
        WebElement button2 = driver.findElement(By.xpath(secondString));
        button2.click();
        Thread.sleep(20000);
    }
}



