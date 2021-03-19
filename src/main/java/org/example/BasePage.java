package org.example;

import com.codeborne.selenide.Configuration;
import org.testng.internal.annotations.IBeforeMethod;

import static com.codeborne.selenide.Selenide.open;

public class BasePage {
    String url ="https://www.trendyol.com/yardim/sorular";

    public void startUp() {

        Configuration.browser = "Chrome";
        Configuration.startMaximized = true;


    }
    void goToPage(){
        open(url);
    }

}
