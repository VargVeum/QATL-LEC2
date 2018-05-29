import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseTest {
  protected static WebDriver driver;

  public BaseTest() {
    initChromeDriver();
  }

  public void initChromeDriver() {
    System.setProperty("webdriver.chrome.driver", BaseTest.class.getResource(getDriverFileName()).getPath());
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

  private String getDriverFileName() {
    String osType = System.getProperty("os.name");

    if (osType.equals("Linux"))
      return "chromedriver";
    if (osType.equals("Windows"))
      return "chromedriver.exe";
    return "chromedriver";
  }

  public void closeChromeDriver() {
    driver.close();
  }

  public void openAdminURL() {
    driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");
  }

  public void clickToLogoutButton() {
    WebElement logoutButton = driver.findElement(By.id("header_logout"));
    logoutButton.click();
  }

  public void clickToHeaderMenu() {
    WebElement userMenu = driver.findElement(By.id("header_employee_box"));
    userMenu.click();
  }

  public void clickLoginButton() {
    WebElement loginButton = driver.findElement(By.name("submitLogin"));
    loginButton.click();
  }

  public void enterPassword() {
    WebElement passwordField = driver.findElement(By.id("passwd"));
    passwordField.sendKeys("Xcg7299bnSmMuRLp9ITw");
  }

  public void enterLogin() {
    WebElement loginField = driver.findElement(By.id("email"));
    loginField.sendKeys("webinar.test@gmail.com");
  }
}
