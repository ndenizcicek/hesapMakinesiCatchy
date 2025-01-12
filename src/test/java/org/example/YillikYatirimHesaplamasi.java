package org.example;

import com.thoughtworks.gauge.Step;
import driver.BrowserFactory;
import driver.ChromeStrategy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class YillikYatirimHesaplamasi {

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

    @Step("yatirim yapilacak deger girilir, 200 tl")
    public void ikiyüztl(){
        driver.findElement(By.className("div:nth-child(14)")).click();

        driver.findElement(By.cssSelector("div:nth-child(17)")).click();

        driver.findElement(By.cssSelector("div:nth-child(17)")).click();
    }

    @Step("carpi butonuna basilir")
    public void multiplication() {

        driver.findElement(By.cssSelector("div:nth-child(8) div:nth-child(1) div:nth-child(1)")).click();

    }

    @Step("faiz orani girilir (ornek:4% ise 4 olarak girilir)")
    public void interestRate() {

        driver.findElement(By.cssSelector("body > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(9)")).click();

    }

    @Step("esittir butonuna basilir ve sonuc gozlemlenir")
    public void equal(){
        driver.findElement(By.cssSelector("div:nth-child(20)")).click();    }


    @Step("bolme islemine basilir")
    public void divide() throws InterruptedException {

        Thread.sleep(2000);

        driver.findElement(By.cssSelector("div[class='css-175oi2r r-97e31f r-bv2aro r-hxflta r-10xqauy r-1awozwy r-13awgt0 r-d23pfw r-13qz1uu'] div:nth-child(4)")).click();
    }

    @Step("100 degeri girilir")
    public void yuztl() throws InterruptedException {

        Thread.sleep(2000);

        driver.findElement(By.cssSelector("div:nth-child(13)")).click();

        driver.findElement(By.cssSelector("div:nth-child(17)")).click();

        driver.findElement(By.cssSelector("div:nth-child(17)")).click();
    }

    @Step("esittir butonuna basilir ve sonuc gozlemlenir")
    public void equalls() throws InterruptedException {

        Thread.sleep(2000);

        driver.findElement(By.cssSelector("div:nth-child(20)")).click();    }

    @Step("arti butonuna basilir")
    public void plus() throws InterruptedException {

        Thread.sleep(2000);


        driver.findElement(By.cssSelector("div:nth-child(16)")).click();
    }

    @Step("yatirim yapilacak deger girilir, 200 tl")
    public void ikiyüztll() throws InterruptedException {

        Thread.sleep(2000);

        driver.findElement(By.cssSelector("div:nth-child(14)")).click();

        driver.findElement(By.cssSelector("div:nth-child(17)")).click();

        driver.findElement(By.cssSelector("div:nth-child(17)")).click();
    }

    @Step("esittir butonuna basilir ve ekrana 12 ay sonraki degerin geldigi gozlemlenir")
    public void equalTo(){
        driver.findElement(By.cssSelector("div:nth-child(20)")).click();
    }


}
