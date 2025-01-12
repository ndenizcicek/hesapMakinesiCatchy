package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EdgeStrategy implements BrowserStrategy{

    @Override
    public WebDriver createDriver(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/msedgedriver.exe");
        return new ChromeDriver();
    }
}
