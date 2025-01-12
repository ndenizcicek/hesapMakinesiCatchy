package driver;

import org.openqa.selenium.WebDriver;

public class BrowserFactory {
    private BrowserStrategy strategy;

    public BrowserFactory(BrowserStrategy strategy){
        this.strategy = strategy;
    }

    public WebDriver getDriver(){
        return strategy.createDriver();
    }
}
