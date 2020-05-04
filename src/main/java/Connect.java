import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

/**
 * class - wpO6b имеет 10 элементов на странице html
 * 1 - лайк
 * 2- комментарий
 * 3 - избранное
 * ...
 * 10 - выход из публикации
 */

public class Connect {
    public void HookBefore() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/didenkoav/IdeaProjects/InstaProject/src/main/resources/MacOS/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.instagram.com/");
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.xpath("//*[@name=\"username\"]")).sendKeys("login");
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.xpath("//*[@name=\"password\"]")).sendKeys("password");
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.xpath("//*[normalize-space(text())='Войти']")).click();
        TimeUnit.SECONDS.sleep(2);
        try {driver.findElement(By.xpath("//*[@class='aOOlW   HoLwm ']")).click();
        }catch (NoSuchElementException e){
            System.out.println("Уведомления уже включены");
        }
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.xpath("//*[@id=\"react-root\"]/section/nav/div[2]/div/div/div[2]/input")).sendKeys("#sport");
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.xpath("//*[@class='z556c']")).click();
        TimeUnit.SECONDS.sleep(2);
        int i  = driver.findElements(By.xpath("//*[@class='v1Nh3 kIKUG  _bz0w']")).size();
        System.out.println(i);

        for (int j = 0; j<=i ; j++) {
            driver.findElements(By.xpath("//*[@class='v1Nh3 kIKUG  _bz0w']")).get(j).click();
            TimeUnit.SECONDS.sleep(2);
            driver.findElement(By.xpath("//*[@class='oW_lN sqdOP yWX7d    y3zKF     ']")).click();
            TimeUnit.SECONDS.sleep(3);
            driver.findElement(By.xpath("//*[@class='wpO6b ']")).click();
            TimeUnit.SECONDS.sleep(3);
            //wpO6b - в описании.
            int close = driver.findElements(By.xpath("//*[@class='wpO6b ']")).size();
            driver.findElements(By.xpath("//*[@class='wpO6b ']")).get(close-1).click();

        }





    }

}
