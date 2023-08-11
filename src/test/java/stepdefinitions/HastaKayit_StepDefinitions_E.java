package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.BasePage;
import pages.Hasta_Kayit_Page_E;
import utilities.ConfigReader;
import utilities.Driver;

public class HastaKayit_StepDefinitions_E {



    BasePage basePage = new BasePage();
    Actions actions = new Actions(Driver.getDriver());
    Hasta_Kayit_Page_E hasta_kayit_page = new Hasta_Kayit_Page_E();


    @When("Click the Hasta button")
    public void click_the_hasta_button() {

        basePage.hastaButton.click();
    }
    @When("Enter Kurum, Kurum detay")
    public void enter_kurum_kurum_detay() {

        hasta_kayit_page.kurum.sendKeys(ConfigReader.getProperty("kurum"));
        hasta_kayit_page.kurumDetay.sendKeys(ConfigReader.getProperty("kurum_Detay"));
    }
    @Then("click the Kaydet-F10- button")
    public void click_the_kaydet_f10_button() {

        hasta_kayit_page.ceptelefonu.click();
        hasta_kayit_page.ceptelefonu.sendKeys("05411111458");
        hasta_kayit_page.kaydetButton.click();
    }
    @Then("verify -Hasta Karti Düzenleme - T.C kimlik numarasi bos olamaz ...PROBEL!- message")
    public void verify_hasta_karti_düzenleme_t_c_kimlik_numarasi_bos_olamaz_probel_message() {

        Assert.assertTrue(hasta_kayit_page.HataMassage.isDisplayed());
    }


    @Then("select nationality uyruk -ABD \\(Amerika Birleşik D.)-")
    public void select_nationality_uyruk_abd_amerika_birleşik_d() {

        Select select = new Select(hasta_kayit_page.uyruguDropdown);
        select.selectByVisibleText("ABD (AMERIKA BIRLEŞİK D.)");
    }
    @Then("Verify that -Pasaport ıd- and -pasaport no- are in the page")
    public void verify_that_pasaport_ıd_and_pasaport_no_are_in_the_page() {

        Assert.assertTrue(hasta_kayit_page.pasaportIdSearchBox.isDisplayed());
        Assert.assertTrue(hasta_kayit_page.pasaportNoSearchBox1.isDisplayed());
        Assert.assertTrue(hasta_kayit_page.pasaportNoSearchBox2.isDisplayed());
    }



    @Then("make patient type -SAĞLIK TURİZMİ-")
    public void make_patient_type_sağlık_turizmi() {

    }
    @Then("Enter -TC no- -Adi -soyadi- -doğum tarihi- -cinsiyet- -ana adi- -baba adi- -doğum yeri- -anne tc no-")
    public void enter_tc_no_adi_soyadi_doğum_tarihi_cinsiyet_ana_adi_baba_adi_doğum_yeri_anne_tc_no() {

    }
    @Then("-Yeni doğan- button click")
    public void yeni_doğan_button_click() {

    }
    @Then("verify the text -Bebeğin doğum haftası günü-")
    public void verify_the_text_bebeğin_doğum_haftası_günü() {

    }
    @Then("-Bebeğin doğum- -haftasi\\/günü- enter a week and future days")
    public void bebeğin_doğum_haftasi_günü_enter_a_week_and_future_days() {

    }
    @Then("enter mobile number -cep telefonu- and click -sms gönderilebilir-")
    public void enter_mobile_number_cep_telefonu_and_click_sms_gönderilebilir() {

    }
    @Then("Click the -kaydet f10- boxxx")
    public void click_the_kaydet_f10_boxxx() {

    }

}
