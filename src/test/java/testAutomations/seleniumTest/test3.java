package testAutomations.seleniumTest;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.appium.java_client.TouchAction;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.By;
import org.junit.jupiter.api.*;
import java.net.URL;
import java.net.MalformedURLException;
import java.time.Duration;
import java.util.logging.Level;

public class test3 {
    private String reportDirectory = "reports";
    private String reportFormat = "xml";
    private String testName = "Untitled";
    protected AndroidDriver<AndroidElement> driver = null;

    DesiredCapabilities dc = new DesiredCapabilities();

    @BeforeEach
    public void setUp() throws MalformedURLException {
        dc.setCapability("reportDirectory", reportDirectory);
        dc.setCapability("reportFormat", reportFormat);
        dc.setCapability("testName", testName);
        dc.setCapability(MobileCapabilityType.UDID, "emulator-5554");
        dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.basarsoft.gfk.fullcensus.morocco");
        dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ".SplashActivity");
        driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), dc);
        driver.setLogLevel(Level.INFO);
    }

    @Test
    public void testtest3() {
        new WebDriverWait(driver, 10);
        driver.findElement(By.xpath("//*[@text='While using the app']")).click();
        new WebDriverWait(driver, 10);
        driver.findElement(By.xpath("//*[@text='While using the app']")).click();
        driver.findElement(By.xpath("//*[@text='While using the app']")).click();
        driver.findElement(By.xpath("//*[@text='Allow']")).click();

        driver.findElement(By.xpath("//*[@text='Login']")).click();
        new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='btnSelectProject' and (./preceding-sibling::* | ./following-sibling::*)[./*[@text='361 - Test Proje']]]")));
        driver.findElement(By.xpath("//*[@id='btnSelectProject' and (./preceding-sibling::* | ./following-sibling::*)[./*[@text='361 - Test Proje']]]")).click();
        new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='btnOpenTask' and (./preceding-sibling::* | ./following-sibling::*)[./*[@text='318 - test1']]]")));
        driver.findElement(By.xpath("//*[@id='btnOpenTask' and (./preceding-sibling::* | ./following-sibling::*)[./*[@text='318 - test1']]]")).click();
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='btnShopDialog']")));
        driver.findElement(By.xpath("//*[@id='btnShopDialog']")).click();
        driver.findElement(By.xpath("//*[@text='Save']")).click();
        driver.findElement(By.xpath("//*[@id='btnSaveDraw']")).click();
        new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='SURVEY']")));
        driver.findElement(By.xpath("//*[@text='SURVEY']")).click();
        driver.findElement(By.xpath("//*[@text='Wait']")).click();
        driver.findElement(By.xpath("//*[@text='Start Survey']")).click();
    }

//    @AfterEach
//    public void tearDown() {
//        driver.quit();
//    }
}