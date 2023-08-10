package nocommerce;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class registerpage {
    @Test
    public void Clickonregister() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\chrome driver\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

                driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).click();
driver.findElement(By.id("gender-male")).click();
driver.findElement(By.id("FirstName")).sendKeys("Adfarsh");
        driver.findElement(By.id("LastName")).sendKeys("Patro");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[1]")).sendKeys("1");
driver.findElement(By.name("DateOfBirthMonth")).sendKeys("October");
driver.findElement(By.name("DateOfBirthYear")).sendKeys("1998");
driver.findElement(By.id("Email")).sendKeys("adarshxyz89@gmail.com");

        JavascriptExecutor jse = (JavascriptExecutor)  driver;
        jse.executeScript("window.scroll(0,800)");
            driver.findElement(By.id("Password")).sendKeys("Adar12345");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("Adar12345");
        driver.findElement(By.id("register-button")).click();





        }
    }
