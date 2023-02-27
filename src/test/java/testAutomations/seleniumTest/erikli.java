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

public class erikli {
    private String reportDirectory = "reports";
    private String reportFormat = "xml";
    private String testName = "Test123";
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
    public void testerikli() {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='WHILE USING THE APP']")));
        driver.findElement(By.xpath("//*[@text='WHILE USING THE APP']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='WHILE USING THE APP']")));
        driver.findElement(By.xpath("//*[@text='WHILE USING THE APP']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='WHILE USING THE APP']")));
        driver.findElement(By.xpath("//*[@text='WHILE USING THE APP']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='ALLOW']")));
        driver.findElement(By.xpath("//*[@text='ALLOW']")).click();

//        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Login']")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='Login']")));
        driver.findElement(By.xpath("//*[@text='Login']")).click();


//        new WebDriverWait(driver, 30);
//       new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='btnSelectProject' and (./preceding-sibling::* | ./following-sibling::*)[./*[@text='361 - Test Proje']]]")));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='btnSelectProject' and (./preceding-sibling::* | ./following-sibling::*)[./*[@text='361 - Test Proje']]]")));
//        driver.findElement(By.xpath("//*[@id='btnSelectProject' and (./preceding-sibling::* | ./following-sibling::*)[./*[@text='361 - Test Proje']]]")).click();
//        driver.findElement(By.xpath("//*[@id='btnSelectProject' and (./preceding-sibling::* | ./following-sibling::*)[./*[@text='361 - Test Proje']]]")).click();
//        driver.findElement(By.xpath("(//*[@id='lvProjectList']/*/*[@id='btnSelectProject'])[2]")).click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    @AfterEach
    public void tearDown() {driver.quit();
    }
}
