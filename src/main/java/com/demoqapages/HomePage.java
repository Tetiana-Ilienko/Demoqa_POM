package com.demoqapages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePages{

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".card:nth-child(2)")
    WebElement forms;

    public SidePanel getForms() {
       // click(forms);
        clickWithJS(forms, 0,300);

        return  new SidePanel(driver);
    }

    @FindBy(css = ".fc-button-label")
    WebElement buttonLabel;

    public HomePage confirmCookie(){
        click(buttonLabel);
        return this;
    }
}
