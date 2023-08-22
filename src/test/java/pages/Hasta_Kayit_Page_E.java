package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Hasta_Kayit_Page_E {
    public Hasta_Kayit_Page_E() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//input[@class='inpt wpx50'])[3]")
    public WebElement kurum;

    @FindBy(xpath = "(//input[@class='inpt wpx50'])[4]")
    public WebElement kurumDetay;

    @FindBy(id = "PopupSaveButton_0")
    public  WebElement kaydetButton;
    @FindBy(xpath = "(//p)[1]")
    public WebElement HataMassage;



    @FindBy(xpath = "//*[@id=\"TXT_HASTA_KAYIT_CEP_TEL\"]")
    public WebElement ceptelefonu;

    @FindBy(xpath = "//*[@id=\"TXT_HASTA_KAYIT_EMAIL\"]")
    public WebElement email;


}



