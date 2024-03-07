package com.demoqapages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePages {

    WebDriver driver;

    JavascriptExecutor js; // реклама

    public BasePages(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        js = (JavascriptExecutor) driver;
    }

    public void click(WebElement element) {
        element.click();
    }


    public void type(WebElement element, String text) {

        if (text != null) {
            click(element);
            element.clear();
            element.sendKeys(text);
        }

    }

    //  избавляемся от рекламы
    public void hideIframes(){
        js.executeScript("document.getElementById('fixedban').style.display='none';");
        js.executeScript("document.querySelector('footer').style.display='none';");

    }

    public void clickWithJS(WebElement element, int x, int y) {
        js.executeScript("window.scrollBy(" + x + "," + y + ") ");
        click(element);

    }
}
