package nocommerce;

import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class loginpage {

    @Test
    public void Clickonregister() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\chrome driver\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
        driver.findElement(By.id("Email")).sendKeys("adarshxyz89@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("Adar12345");

        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();

        Thread.sleep(3000);
        JavascriptExecutor jse = (JavascriptExecutor)  driver;
        jse.executeScript("window.scroll(0,1200)");
driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[1]/div/div[2]/div[3]/div[2]/button[1]")).click();

driver.findElement(By.xpath("//*[@id=\"product_attribute_2\"]")).click();
        WebElement from = driver.findElement(By.xpath("//*[@id=\"product_attribute_2\"]"));

        from .sendKeys("8GB [+$60.00]");

        from.sendKeys(Keys.ARROW_DOWN);

        from.sendKeys(Keys.ENTER);
        jse.executeScript("window.scroll(0,1000)");
driver.findElement(By.id("product_attribute_3_7")).click();
        jse.executeScript("window.scroll(0,300)");
        driver.findElement(By.id("product_attribute_5_11")).click();
        driver.findElement(By.id("product_attribute_5_12")).click();
        driver.findElement(By.id("add-to-cart-button-1")).click();
        Thread.sleep(3000);
        jse.executeScript("window.scroll(0,-300)");

        driver.findElement(By.id("small-searchterms")).sendKeys("Books");
        driver.findElement(By.xpath("//*[@id=\"small-search-box-form\"]/button")).click();
        Thread.sleep(3000);
        jse.executeScript("window.scroll(900)");
        driver.findElement(By.className("button-2 product-box-add-to-cart-button")).click();
        jse.executeScript("window.scroll(-900)");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"topcartlink\"]/a/span[1]")).click();
        jse.executeScript("window.scroll(1000)");
        driver.findElement(By.id("checkout_attribute_1")).sendKeys("Yes [+$10.00]");
        driver.findElement(By.id("termsofservice")).click();
        driver.findElement(By.id("checkout")).click();

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://demo.nopcommerce.com/onepagecheckout#opc-billing");
        driver.findElement(By.id("BillingNewAddress_CountryId")).sendKeys("India");

        driver.findElement(By.id("BillingNewAddress_City")).sendKeys("Kolkata");
        driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys("xyz colony");
        driver.findElement(By.id("BillingNewAddress_Address2")).sendKeys("ye laane");
        driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("258963");
        driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("1234567895");
        driver.findElement(By.cssSelector("#billing-buttons-container > button.button-1.new-address-next-step-button")).click();





    }
}