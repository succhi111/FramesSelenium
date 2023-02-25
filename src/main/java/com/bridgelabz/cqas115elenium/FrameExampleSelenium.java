package com.bridgelabz.cqas115elenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameExampleSelenium {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\suche\\Documents\\Drivers\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("C:\\Users\\suche\\IdeaProjects\\FramesSelenium\\src\\main\\resources\\Page3.html");
        Thread.sleep(2000);

        driver.findElement(By.id("t3")).sendKeys("T3 TEXT FEILD");
        Thread.sleep(2000);

        driver.switchTo().frame("f2");
        driver.findElement(By.id("t2")).sendKeys("T2 TEXT FEILD");
        Thread.sleep(2000);

        driver.switchTo().frame("f1");
        driver.findElement(By.id("t1")).sendKeys("T1 TEXT FEILD");
        Thread.sleep(2000);
        driver.switchTo().defaultContent();

        driver.findElement(By.id("t3")).clear();
        driver.findElement(By.id("t3")).sendKeys("after executing default context");
        Thread.sleep(2000);
         driver.quit();

    }
}