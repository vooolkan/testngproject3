package com.techproed.pages;

import com.techproed.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//PAGE CLASS
//THIS CLASS WILL ONLY HAVE PAGE OBJECTS/PAGE ELEMENTS
public class FaceLoginPage {

    //Create the constructor to initialize the driver
    public FaceLoginPage(){
        //initElements initializes the driver in page object model
     PageFactory.initElements(Driver.getDriver(),this);
        //We use initElements to initialize the driver in the constructor
    }

    @FindBy(id="email")
    public WebElement username;

    @FindBy(id="pass")
    public WebElement password;

    @FindBy(xpath="//button[@id='u_0_b']")
    public WebElement login;

    @FindBy(xpath = "//div[@class='_9ay7']")
    public WebElement errorMessage;


}
