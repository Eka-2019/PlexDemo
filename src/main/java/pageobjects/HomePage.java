package pageobjects;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

@Getter
public class HomePage extends BaseMain {
    By menuList = By.xpath("//div[@class='menu-list']");
    By contactUsBtn = By.xpath("//div[@class='header-right']/div[@class='headerButtons']//a[contains(text(), 'Talk to Us')]");
    public HomePage(WebDriver dr) {
        super(dr);
    }

    public List<String> getMenuListNames(){
        List<WebElement> mList = driver.findElements(menuList);
        List<String> menuListNames = new ArrayList<>();
        for (WebElement element : mList) {
            menuListNames.add(element.getText());
        }
        return menuListNames;
    }
    public List<WebElement> getSubMenuList(int index) {
        By subMenuList = By.xpath("//div[@class='menu-list'][" + (index+1) + "]//ul/li");
        List<WebElement> mList = driver.findElements(menuList);
        WebElement selectedMenuElement = mList.get(index);
        moveMouseToElement(selectedMenuElement);
        return selectedMenuElement.findElements(subMenuList);
    }

    public List<String> getSubMenuListNames(int index) {
        List<WebElement> list = getSubMenuList(index);
        List<String> subListText = new ArrayList<>();
        for (WebElement element : list) {
            subListText.add(element.getText());
        }
        return subListText;
    }

    public void clickSubMenuElement(String name){
        By subMenuElement = By.partialLinkText(name);
        driver.findElement(subMenuElement).click();
    }

    public void openTalkToUsPage() {
        driver.findElement(contactUsBtn).click();
    }

}
