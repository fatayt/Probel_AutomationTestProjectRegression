package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath ="//a[@class='open']" )
    public WebElement hastaIslemleri;

    @FindBy(xpath ="(//a[@class='open'])[2]" )
    public WebElement ayaktanHastaIslemleri;

    @FindBy(xpath ="(//a[@href='/HBYS_WEB_PRODUCT/POL/POL/POLIKLINIKMUAYENE'])" )
    public WebElement poliklinikMuayneKayit;

    @FindBy(xpath ="//a[@style='padding-left:25px;']" )
    public WebElement hastaButton;


}
