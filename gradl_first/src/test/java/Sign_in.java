

        import java.util.regex.Pattern;
        import java.util.concurrent.TimeUnit;
        import org.testng.annotations.*;
        import static org.testng.Assert.*;
        import org.openqa.selenium.*;
        import org.openqa.selenium.firefox.FirefoxDriver;
        import org.openqa.selenium.support.ui.Select;

public class Sign_in {
private WebDriver driver;
private String baseUrl;
private boolean acceptNextAlert = true;
private StringBuffer verificationErrors = new StringBuffer();

@BeforeClass(alwaysRun = true)
public void setUp() throws Exception {
        driver = new FirefoxDriver();
        baseUrl = "https://www.katalon.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }

@Test
public void test() throws Exception {
        driver.get("https://development.olportal-lk.dev.smedialink.com/login");
        driver.findElement(By.id("phone")).click();
        driver.findElement(By.id("phone")).clear();
        driver.findElement(By.id("phone")).sendKeys("918 420 45 26");
        driver.findElement(By.xpath("//div[@id='app']/div/div/div/div/form/div/label/div")).click();
        driver.findElement(By.xpath("//div[@id='app']/div/div/div/div/form/div/div[2]/button")).click();
        driver.findElement(By.xpath("//input[@value='']")).click();
        driver.findElement(By.xpath("//div[@id='app']/div/div/div/div/form/div/div[2]/div/div/input")).clear();
        driver.findElement(By.xpath("//div[@id='app']/div/div/div/div/form/div/div[2]/div/div/input")).sendKeys("00000");
        driver.findElement(By.xpath("//div[@id='app']/div/div/div/div/form/div/div[4]/button")).click();


///заполнение анкекеты инвестора
        driver.findElement(By.linkText("Заполнение анкеты инвестора")).click();
        driver.findElement(By.xpath("//div[@id='app']/div/div/div[2]/div/div/div[2]/form/div[4]/div/div/div[2]/input")).click();
        driver.findElement(By.xpath("//div[@id='app']/div/div/div[2]/div/div/div[2]/form/div[4]/div/div/div[2]/input")).clear();
        driver.findElement(By.xpath("//div[@id='app']/div/div/div[2]/div/div/div[2]/form/div[4]/div/div/div[2]/input")).sendKeys("222");
        driver.findElement(By.xpath("//div[@id='app']/div/div/div[2]/div/div/div[2]/form/div[9]/button")).click();
        }

@AfterClass(alwaysRun = true)
public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
        fail(verificationErrorString);
        }
        }

private boolean isElementPresent(By by) {
        try {
        driver.findElement(by);
        return true;
        } catch (NoSuchElementException e) {
        return false;
        }
        }

private boolean isAlertPresent() {
        try {
        driver.switchTo().alert();
        return true;
        } catch (NoAlertPresentException e) {
        return false;
        }
        }

private String closeAlertAndGetItsText() {
        try {
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        if (acceptNextAlert) {
        alert.accept();
        } else {
        alert.dismiss();
        }
        return alertText;
        } finally {
        acceptNextAlert = true;
        }
        }
        }
