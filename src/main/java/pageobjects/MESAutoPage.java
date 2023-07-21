package pageobjects;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@Getter
public class MESAutoPage extends BaseMain{

    By header3 = By.xpath("//h3[contains(text(),'Orchestrate')]");

    public MESAutoPage(WebDriver dr) {
        super(dr);
    }

}
