package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Detayli_Arama_Page {
    public Detayli_Arama_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
