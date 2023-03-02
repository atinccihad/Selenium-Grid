package gridSetupTest.SeleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridTest {

    public static void main(String[] args) throws MalformedURLException {

        //1)Desired Capabilities
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setBrowserName("chrome");
        cap.setPlatform(Platform.ANY);

        //2)Chrome Options to merge
        ChromeOptions options = new ChromeOptions();
        options.merge(cap);

        String hubUrl = "http://192.168.1.77:4444/wd/hub";
        WebDriver driver = new RemoteWebDriver(new URL(hubUrl), options);

        driver.get("http://www.google.com");
        System.out.println(driver.getTitle());//Google

    }

}
