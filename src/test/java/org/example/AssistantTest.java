package org.example;

import com.codeborne.selenide.Configuration;

import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class AssistantTest extends BasePage {
    @Test
    public void  shouldNotAssist() throws InterruptedException {



       // $(".help-search").setValue("deneme");



        SelenideElement siparis2 =  $(byText("Sepet Birlestirme"));
        String htext2= siparis2.getText();
        siparis2.click();
        String text2 =$(".ui-accordion-header-active").getText();

        Assert.assertNotEquals(htext2,text2);

        Thread.sleep(4000);

    }




}
