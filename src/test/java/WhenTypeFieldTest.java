
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import pages.LambdaPageIE;

import java.util.concurrent.TimeUnit;

public class WhenTypeFieldTest {
    private WebDriver driver;
    private LambdaPageIE page;

    @Before
    public void setUp() {
        System.setProperty("webdriver.ie.driver", "D:\\IT\\iedriver\\IEDriverServer.exe");
        DesiredCapabilities ieCapabilities = DesiredCapabilities.internetExplorer();
        ieCapabilities.setCapability("nativeEvents", false);
        ieCapabilities.setCapability("unexpectedAlertBehaviour", "accept");
        ieCapabilities.setCapability("ignoreProtectedModeSettings", true);
        ieCapabilities.setCapability("disable-popup-blocking", true);
        ieCapabilities.setCapability("enablePersistentHover", true);
        ieCapabilities.setCapability("ignoreZoomSetting", true);

        driver = new InternetExplorerDriver(ieCapabilities);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://lambdatest.github.io/sample-todo-app/");
        page = new LambdaPageIE(driver);
    }

    @Test
    public void typeMoreTest(){
        page.typeToFieldAddMore("add more");
        page.clickAddButton();

    }

}
