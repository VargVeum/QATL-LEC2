//Скрипт Б. Проверка работоспособности главного меню Админ панели
//        1. Войти в Админ панель (по аналогии с предыдущим скриптом)
//        2. Кликнуть на каждом видимом пункте главного меню (Dashboard, Заказы, Каталог, Клиенты...) для открытия соответствующего раздела и выполнить следующее:
//        a. Вывести в консоль заголовок открытого раздела.
//        b. Выполнить обновление (рефреш) страницы и проверить, что пользователь остается в том же разделе после перезагрузки страницы.

//Для доступа в Админ Панель используйте следующие данные:
//        Адрес: http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/
//        Логин: webinar.test@gmail.com
//        Пароль: Xcg7299bnSmMuRLp9ITw

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class WorkWithAdminPanelTest extends BaseTest {

  public void workWithAdminPanel() {
    openAdminURL();

    // login
    enterLogin();
    enterPassword();
    clickLoginButton();

    // check pages
    checkDashboard();
    checkOrders();
    checkCatalog();
    checkClients();
    checkSupport();
    checkStatistics();
    checkModules();
    checkDesign();
    checkDelivery();
    checkPayments();
    checkInternational();
    checkShopParameters();
    checkConfiguration();

    // logout
    clickToHeaderMenu();
    clickToLogoutButton();

    closeChromeDriver();
  }

  private void checkDashboard() {
    WebElement dashboardButton = driver.findElement(By.xpath("//span[contains(text(),'Dashboard')]"));
    dashboardButton.click();
    Assert.assertEquals("Dashboard • prestashop-automation", driver.getTitle());
    driver.navigate().refresh();
    Assert.assertEquals("Dashboard • prestashop-automation", driver.getTitle());
  }

  private static void checkConfiguration() {
    WebElement configurationButton = driver.findElement(By.xpath("//span[contains(text(),'Конфигурация')]"));
    configurationButton.click();
    Assert.assertEquals("Information • prestashop-automation", driver.getTitle());
    driver.navigate().refresh();
    Assert.assertEquals("Information • prestashop-automation", driver.getTitle());
  }

  private static void checkShopParameters() {
    WebElement storeOptionsButton = driver.findElement(By.xpath("//span[contains(text(),'Shop Parameters')]"));
    storeOptionsButton.click();
    Assert.assertEquals("General • prestashop-automation", driver.getTitle());
    driver.navigate().refresh();
    Assert.assertEquals("General • prestashop-automation", driver.getTitle());
  }

  private static void checkInternational() {
    WebElement internationalButton = driver.findElement(By.xpath("//span[contains(text(),'International')]"));
    internationalButton.click();
    Assert.assertEquals("Локализация • prestashop-automation", driver.getTitle());
    driver.navigate().refresh();
    Assert.assertEquals("Локализация • prestashop-automation", driver.getTitle());
  }

  private static void checkPayments() {
    WebElement paymentMethodButton = driver.findElement(By.xpath("//span[contains(text(),'Способ оплаты')]"));
    paymentMethodButton.click();
    Assert.assertEquals("Payment Methods • prestashop-automation", driver.getTitle());
    driver.navigate().refresh();
    Assert.assertEquals("Payment Methods • prestashop-automation", driver.getTitle());
  }

  private static void checkDelivery() {
    WebElement deliveryButton = driver.findElement(By.id("subtab-AdminParentShipping"));
    deliveryButton.click();
    Assert.assertEquals("Курьеры • prestashop-automation", driver.getTitle());
    driver.navigate().refresh();
    Assert.assertEquals("Курьеры • prestashop-automation", driver.getTitle());
  }

  private static void checkDesign() {
    WebElement designButton = driver.findElement(By.xpath("//span[contains(text(),'Design')]"));
    designButton.click();
    Assert.assertEquals("Шаблоны • prestashop-automation", driver.getTitle());
    driver.navigate().refresh();
    Assert.assertEquals("Шаблоны • prestashop-automation", driver.getTitle());
  }

  private static void checkModules() {
    WebElement modulesButton = driver.findElement(By.xpath("//span[contains(text(),'Modules')]"));
    modulesButton.click();
    Assert.assertEquals("prestashop-automation", driver.getTitle());
    driver.navigate().refresh();
    Assert.assertEquals("prestashop-automation", driver.getTitle());
  }

  private static void checkStatistics() {
    WebElement statisticsButton = driver.findElement(By.xpath("//span[contains(text(),'Статистика')]"));
    statisticsButton.click();
    Assert.assertEquals("Статистика • prestashop-automation", driver.getTitle());
    driver.navigate().refresh();
    Assert.assertEquals("Статистика • prestashop-automation", driver.getTitle());
  }

  private static void checkSupport() {
    WebElement supportServiceButton = driver.findElement(By.xpath("//span[contains(text(),'Служба поддержки')]"));
    supportServiceButton.click();
    Assert.assertEquals("Customer Service • prestashop-automation", driver.getTitle());
    driver.navigate().refresh();
    Assert.assertEquals("Customer Service • prestashop-automation", driver.getTitle());
  }

  private static void checkClients() {
    WebElement clientsButton = driver.findElement(By.xpath("//span[contains(text(),'Клиенты')]"));
    clientsButton.click();
    Assert.assertEquals("Управление клиентами • prestashop-automation", driver.getTitle());
    driver.navigate().refresh();
    Assert.assertEquals("Управление клиентами • prestashop-automation", driver.getTitle());
  }

  private static void checkCatalog() {
    WebElement catalogButton = driver.findElement(By.xpath("//span[contains(text(),'Каталог')]"));
    catalogButton.click();
    Assert.assertEquals("товары • prestashop-automation", driver.getTitle());
    driver.navigate().refresh();
    Assert.assertEquals("товары • prestashop-automation", driver.getTitle());
  }

  private static void checkOrders() {
    WebElement ordersButton = driver.findElement(By.xpath("//span[contains(text(),'Заказы')]"));
    ordersButton.click();
    Assert.assertEquals("Заказы • prestashop-automation", driver.getTitle());
    driver.navigate().refresh();
    Assert.assertEquals("Заказы • prestashop-automation", driver.getTitle());
  }


}
