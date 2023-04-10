package nopcommerce;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.List;

public class MultiBrowserTest {
    // 1. Set up Chrome browser
    static String browser = "Chrome";
    // 2. Open URL
    static String baseUrl = "https://demo.nopcommerce.com/login/";
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong Browser name");
        }
        driver.get(baseUrl);
        driver.manage().window().maximize();
       //giving implicitly wait to driver by using implicitly method
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

      // 3. Print the title of the page
        System.out.println("Page title: " + driver.getTitle());
      // 4. Print the current URL
        System.out.println("Current Url : " + driver.getCurrentUrl());
      // 5. Print the page source
        System.out.println("Page source : " + driver.getPageSource());
      // 6. Enter the email into email field
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("mvthakur2011@gmail.com");
      // 7. Enter the password into password field
        WebElement passwordField = driver.findElement(By.id("Password"));
        passwordField.sendKeys("Mv123");

      // 8. Close the browser
        driver.close();

    }

}

