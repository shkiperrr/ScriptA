import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebDriverExmple{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = getDriver();
        driver.manage().window().maximize();
        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/index.php?controller=AdminLogin&token=d251f363cceb5a849cb7330938c64dea");

        WebElement searchInputEmail = driver.findElement(By.id("email"));
        searchInputEmail.sendKeys("webinar.test@gmail.com");

        WebElement searchInputPassword = driver.findElement(By.id("passwd"));
        searchInputPassword.sendKeys("Xcg7299bnSmMuRLp9ITw");

        WebElement searchButtonIn = driver.findElement(By.name("submitLogin"));
        searchButtonIn.click();


        Thread.sleep(10000);

        WebElement searchButtonLog = driver.findElement(By.className("employee_avatar_small"));
        searchButtonLog.click();

        WebElement searchButtonOut = driver.findElement(By.id("header_logout"));
        searchButtonOut.click();

        System.out.println("Page title is " + driver.getTitle());


    }

    public static WebDriver getDriver() {
       System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "//resourses//chromedriver.exe" );
       return new ChromeDriver();
    }
}
