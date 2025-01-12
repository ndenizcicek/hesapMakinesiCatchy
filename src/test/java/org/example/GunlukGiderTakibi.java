package org.example;

import com.thoughtworks.gauge.Step;
import driver.BrowserFactory;
import driver.ChromeStrategy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GunlukGiderTakibi {

    WebDriver driver;

    @Step("hesap makinesi sayfasi acilir ve open calculatır butonuna basilir")
    public void navigateToHomePage() throws InterruptedException {
        BrowserFactory browserFactory = new BrowserFactory(new ChromeStrategy());
        driver = browserFactory.getDriver();
        driver.get("https://catchylabs-webclient.testinium.com/");

        Thread.sleep(5000);

        if (driver.findElement(By.cssSelector("input[placeholder='Username']")).isEnabled())
        {
            driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("nihatdeniz.cicek@testinium.com");

            driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("Terfi2025*");

            driver.findElement(By.cssSelector(".css-175oi2r.r-1i6wzkk.r-lrvibr.r-1loqt21.r-1otgn73.r-1awozwy.r-169ebfh.r-z2wwpe.r-h3s6tt.r-1777fci.r-tsynxw.r-13qz1uu")).click();

            Thread.sleep(5000);

            driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]")).click();

        }else {
            driver.findElement(By.className("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]")).click();

        }

    }


    @Step("ac butonuna basılır, işlem yapmadan önce ekranın temiz olduğundan emin olunur")
    public void screenClean(){

        driver.findElement(By.cssSelector("body > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1)")).click();

    }

    @Step("deger olarak 20 girilir")
    public void yirmiTL() throws InterruptedException {
        driver.findElement(By.cssSelector("div:nth-child(14)")).click();

        Thread.sleep(2000);

        driver.findElement(By.cssSelector("div:nth-child(17)")).click();

    }

    @Step("arti butonuna basilir")
    public void plus(){
        driver.findElement(By.cssSelector("div:nth-child(16)")).click();
    }

    @Step("deger olarak 10 girilir")
    public void onTL(){
        driver.findElement(By.cssSelector("div:nth-child(13)")).click();

        driver.findElement(By.cssSelector("div:nth-child(17)")).click();
    }

    @Step("esittir butonuna basilir ve sonuc gozlemlenir")
    public void equual(){
        driver.findElement(By.cssSelector("div:nth-child(20)")).click();
    }

    @Step("arti butonuna basilir")
    public void pluss(){
        driver.findElement(By.cssSelector("div:nth-child(16)")).click();
    }

    @Step("deger olarak 5 girilir")
    public void besTL(){
        driver.findElement(By.cssSelector("div:nth-child(10)")).click();
    }

    @Step("esittir butonuna basilir ve sonucun 35 geldigi gozlemlenir")
    public void equal(){
        driver.findElement(By.cssSelector("div:nth-child(20)")).click();
    }

}
