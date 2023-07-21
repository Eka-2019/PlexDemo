package testcases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pageobjects.*;

import java.time.Duration;

public class BaseTest {
    WebDriver driver;
    public HomePage homePage;
    public MESPage mesPage;
    public ERPPage erpPage;
    public MobileAppPage mobPage;
    public QMSPage qmsPage;
    public SCPPage scpPage;
    public ProductionMonitoringPage prodPage;
    public MESAutoPage mesAutoPage;
    public APMPage assetPage;

    public TalkToUsPage talkPage;

    @BeforeMethod()
    public void openDriver() {
        //System.setProperty("webdriver.chrome.driver", "src/test/resources/webdriver/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        homePage = new HomePage(driver);
        homePage.getBaseURL();
        mesPage = new MESPage(driver);
        erpPage = new ERPPage(driver);
        mobPage = new MobileAppPage(driver);
        qmsPage = new QMSPage(driver);
        scpPage = new SCPPage(driver);
        prodPage = new ProductionMonitoringPage(driver);
        mesAutoPage = new MESAutoPage(driver);
        assetPage = new APMPage(driver);
        talkPage = new TalkToUsPage(driver);
    }

    @AfterMethod()
    public void quitDriver() {
        if (driver != null) {
            driver.quit();
        }
    }

    public void wait(ExpectedCondition<WebElement> condition, Integer timeOut) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
        wait.until(condition);
    }

    protected void waitForVisibilityOf(By locator, Integer timeOutInSeconds) {
        try {
            wait(ExpectedConditions.visibilityOfElementLocated(locator),
                    timeOutInSeconds);
        } catch (NoSuchElementException e) {
            System.out.println("NoSuchElementException - -> Element not found");
        }
    }

}
