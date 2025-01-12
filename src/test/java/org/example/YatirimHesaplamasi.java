package org.example;

import com.thoughtworks.gauge.Step;
import driver.BrowserFactory;
import driver.ChromeStrategy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class YatirimHesaplamasi {
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

    @Step("yatirim tutari girilir, 100 tl")
    public void investmentSalary(){

        driver.findElement(By.cssSelector("div:nth-child(13)")).click();

        driver.findElement(By.cssSelector("div:nth-child(17)")).click();

        driver.findElement(By.cssSelector("div:nth-child(17)")).click();

    }

    @Step("carpi butonuna basilir")
    public void multiplication() {

        driver.findElement(By.cssSelector("div:nth-child(8) div:nth-child(1) div:nth-child(1)")).click();

    }

    @Step("faiz orani girilir (ornek:5% ise 5 olarak girilir)")
    public void interestRate() {

        driver.findElement(By.cssSelector("div:nth-child(10)")).click();

    }

    @Step("esittir butonuna basilir ve sonuc gozlemlenir")
    public void equal(){
        driver.findElement(By.cssSelector("div:nth-child(20)")).click();
    }

    @Step("cikan sonuctan sonra bolme islemi butonuna basilir")
    public void divide(){
        driver.findElement(By.cssSelector("div[class='css-175oi2r r-97e31f r-bv2aro r-hxflta r-10xqauy r-1awozwy r-13awgt0 r-d23pfw r-13qz1uu'] div:nth-child(4)")).click();
    }

    @Step("100 olarak deger girilir")
    public void percantage(){
        driver.findElement(By.cssSelector("div:nth-child(13)")).click();

        driver.findElement(By.cssSelector("div:nth-child(17)")).click();

        driver.findElement(By.cssSelector("div:nth-child(17)")).click();
    }

    @Step("esittir butonuna basilir ve sonuc gozlemlenir")
    public void equals(){
        driver.findElement(By.cssSelector("div:nth-child(20)")).click();
    }

    @Step("ac butonuna basilir ve sonucun temizlendigi gozlemlenir")
    public void ACButtonClean(){
        driver.findElement(By.cssSelector("body > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1)")).click();
    }

    @Step("100 olarak deger girilir")
    public void percantages(){
        driver.findElement(By.cssSelector("div:nth-child(13)")).click();

        driver.findElement(By.cssSelector("div:nth-child(17)")).click();

        driver.findElement(By.cssSelector("div:nth-child(17)")).click();
    }

    @Step("arti butonuna basilir")
    public void plus(){
        driver.findElement(By.cssSelector("div:nth-child(16)")).click();
    }

    @Step("9.maddedeki sonuc girilir, 5 TL")
    public void fiveTL(){
        driver.findElement(By.cssSelector("div:nth-child(10)")).click();
    }

    @Step("esittir butonuna basilir ve sonuc gozlemlenir")
    public void equall(){
        driver.findElement(By.cssSelector("div:nth-child(20)")).click();
    }

}
