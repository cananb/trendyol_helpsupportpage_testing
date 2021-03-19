package org.example;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class SupportHelpPage {

    String siparistakibi ="Siparis Takibi";
    String sepetbirlestirme= "Sepet Birlestirme";

    public void click(String param){

        SelenideElement siparis =  $(("Siparis Takibi"));
        String htext= siparis.getText();
        siparis.click();
        String text =$(".ui-accordion-header-active").getText();
    }

}
