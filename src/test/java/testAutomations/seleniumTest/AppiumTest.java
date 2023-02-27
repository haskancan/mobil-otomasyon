package testAutomations.seleniumTest;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AppiumTest {
        public static void main(String[] args) throws Exception {
            // Appium server'a bağlanmak için gerekli olan URL bilgisi
            URL url = new URL("http://0.0.0.0:4723/wd/hub");

            // Uygulama üzerinde test yapmak için gerekli olan cihaz ve uygulama ayarları
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("deviceName", "Android Emulator");
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("appPackage", "erikli");
            capabilities.setCapability("appActivity", "com.example.myapp.MainActivity");

            // Android driver'ı başlatma
            AndroidDriver driver = new AndroidDriver(url, capabilities);
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

            // Test senaryosunu buraya yazabilirsiniz

            // Driver'ı kapatma
            driver.quit();
        }
    }
