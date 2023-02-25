package com.bridgelabz.cqas115elenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropSelenium {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\suche\\Documents\\Drivers\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://jqueryui.com/droppable/");

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));

        WebElement source=driver.findElement(By.id("draggable"));
        WebElement destination=driver.findElement(By.id("droppable"));

        Actions actions=new Actions(driver);
        Thread.sleep(3000);

        actions.dragAndDrop(source,destination).perform();
        Thread.sleep(8000);
        driver.quit();

    }
}

