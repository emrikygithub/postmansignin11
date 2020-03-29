package SignIn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SignInTests {
    private WebDriver driver;

    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://web.postman.co/");

        Thread.sleep(5000);

        driver.manage().window().maximize();

        System.out.println(driver.getTitle());

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("username")).sendKeys("emriky@gmail.com");
        driver.findElement(By.id("password")).sendKeys("boxedup3002");
        driver.findElement(By.id("sign-in-btn")).click();
    }
    public static void main(String[] args) throws InterruptedException {
        SignInTests test = new SignInTests();
        test.setUp();

    }
}
