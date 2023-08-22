package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath ="(//a[@class='open'])[1]" )
    public WebElement hastaIslemleri;

    @FindBy(xpath ="(//a[@class='open'])[2]" )
    public WebElement ayaktanHastaIslemleri;

    @FindBy(xpath ="(//a[@href='/HBYS_WEB_PRODUCT/POL/POL/POLIKLINIKMUAYENE'])" )
    public WebElement poliklinikMuayneKayit;

    @FindBy(xpath ="/html[1]/body[1]/div[1]/div[4]/section[1]/form[1]/div[3]/div[1]/div[1]/div[1]/div[4]/a[2]" )
    public WebElement hastaButton;


}
