import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = getInitFirefoxDriver();
        driver.manage().window().maximize();

        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");

        WebElement adressEmail = driver.findElement(By.id("email"));
        adressEmail.sendKeys("webinar.test@gmail.com");

        Thread.sleep(1000);

        WebElement password = driver.findElement(By.id("passwd"));
        password.sendKeys("Xcg7299bnSmMuRLp9ITw");

        Thread.sleep(1000);

        WebElement button = driver.findElement(By.name("submitLogin"));
        button.click();

        Thread.sleep(3000);

        WebElement pictureUser = driver.findElement(By.cssSelector("#header_employee_box span"));
        pictureUser.click();

        Thread.sleep(1000);

        WebElement logout = driver.findElement(By.id("header_logout"));
        logout.click();

        Thread.sleep(3000);

        WebElement adressEmail1 = driver.findElement(By.id("email"));
        adressEmail1.sendKeys("webinar.test@gmail.com");

        Thread.sleep(1000);

        WebElement password1 = driver.findElement(By.id("passwd"));
        password1.sendKeys("Xcg7299bnSmMuRLp9ITw");

        Thread.sleep(1000);

        WebElement button1 = driver.findElement(By.name("submitLogin"));
        button1.click();

        Thread.sleep(4000);

        WebElement dashboard = driver.findElement(By.cssSelector("#tab-AdminDashboard span"));
        dashboard.click();
        Thread.sleep(2000);
        String razdel = driver.findElement(By.className("page-title")).getText();
        System.out.println(razdel);
        driver.navigate().refresh();

        if (driver.findElement(By.className("page-title")).getText().equals(razdel)==false){
            System.out.println("Ошибка.Произошел переход в другой раздел!");
        }else {
            System.out.println("Пользователь остается в том же разделе!");
        }

        WebElement zakazy = driver.findElement(By.cssSelector("#subtab-AdminParentOrders span"));
        zakazy.click();
        Thread.sleep(2000);
        razdel = driver.findElement(By.className("page-title")).getText();
        System.out.println(razdel);
        driver.navigate().refresh();

        if (driver.findElement(By.className("page-title")).getText().equals(razdel)==false){
            System.out.println("Ошибка.Произошел переход в другой раздел!");
        }else {
            System.out.println("Пользователь остается в том же разделе!");
        }

        WebElement catalog = driver.findElement(By.cssSelector("#subtab-AdminCatalog span"));
        catalog.click();
        Thread.sleep(3000);
        razdel = driver.findElement(By.tagName("h2")).getText();
        System.out.println(razdel);
        driver.navigate().refresh();

        if (driver.findElement(By.tagName("h2")).getText().equals(razdel)==false){
            System.out.println("Ошибка.Произошел переход в другой раздел!");
        }else {
            System.out.println("Пользователь остается в том же разделе!");
        }

        WebElement customers = driver.findElement(By.cssSelector(".link-levelone[data-submenu='23']"));
        customers.click();
        Thread.sleep(2000);
        razdel = driver.findElement(By.className("page-title")).getText();
        System.out.println(razdel);
        driver.navigate().refresh();

        if (driver.findElement(By.className("page-title")).getText().equals(razdel)==false){
            System.out.println("Ошибка.Произошел переход в другой раздел!");
        }else {
            System.out.println("Пользователь остается в том же разделе!");
        }

        WebElement customerThreads = driver.findElement(By.cssSelector("#subtab-AdminParentCustomerThreads span"));
        customerThreads.click();
        Thread.sleep(2000);
        razdel = driver.findElement(By.className("page-title")).getText();
        System.out.println(razdel);
        driver.navigate().refresh();

        if (driver.findElement(By.className("page-title")).getText().equals(razdel)==false){
            System.out.println("Ошибка.Произошел переход в другой раздел!");
        }else {
            System.out.println("Пользователь остается в том же разделе!");
        }

        WebElement stats = driver.findElement(By.cssSelector("#subtab-AdminStats span"));
        stats.click();
        Thread.sleep(2000);
        razdel = driver.findElement(By.className("page-title")).getText();
        System.out.println(razdel);
        driver.navigate().refresh();

        if (driver.findElement(By.className("page-title")).getText().equals(razdel)==false){
            System.out.println("Ошибка.Произошел переход в другой раздел!");
        }else {
            System.out.println("Пользователь остается в том же разделе!");
        }

        WebElement modules = driver.findElement(By.cssSelector("#subtab-AdminParentModulesSf span"));
        modules.click();
        Thread.sleep(20000);
        razdel = driver.findElement(By.tagName("h2")).getText();
        System.out.println(razdel);
        driver.navigate().refresh();

        if (driver.findElement(By.tagName("h2")).getText().equals(razdel)==false){
            System.out.println("Ошибка.Произошел переход в другой раздел!");
        }else {
            System.out.println("Пользователь остается в том же разделе!");
        }

        WebElement design = driver.findElement(By.cssSelector(".link-levelone[data-submenu='46']"));
        design.click();
        Thread.sleep(1000);
        razdel = driver.findElement(By.className("page-title")).getText();
        System.out.println(razdel);
        driver.navigate().refresh();

        if (driver.findElement(By.className("page-title")).getText().equals(razdel)==false){
            System.out.println("Ошибка.Произошел переход в другой раздел!");
        }else {
            System.out.println("Пользователь остается в том же разделе!");
        }

        WebElement dostavka = driver.findElement(By.cssSelector("#subtab-AdminParentShipping span"));
        dostavka.click();
        Thread.sleep(2000);
        razdel = driver.findElement(By.className("page-title")).getText();
        System.out.println(razdel);
        driver.navigate().refresh();

        if (driver.findElement(By.className("page-title")).getText().equals(razdel)==false){
            System.out.println("Ошибка.Произошел переход в другой раздел!");
        }else {
            System.out.println("Пользователь остается в том же разделе!");
        }

        WebElement payment = driver.findElement(By.cssSelector("#subtab-AdminParentPayment span"));
        payment.click();
        Thread.sleep(2000);
        razdel = driver.findElement(By.className("page-title")).getText();
        System.out.println(razdel);
        driver.navigate().refresh();

        if (driver.findElement(By.className("page-title")).getText().equals(razdel)==false){
            System.out.println("Ошибка.Произошел переход в другой раздел!");
        }else {
            System.out.println("Пользователь остается в том же разделе!");
        }

        WebElement international = driver.findElement(By.cssSelector("#subtab-AdminInternational span"));
        international.click();
        Thread.sleep(2000);
        razdel = driver.findElement(By.className("page-title")).getText();
        System.out.println(razdel);
        driver.navigate().refresh();

        if (driver.findElement(By.className("page-title")).getText().equals(razdel)==false){
            System.out.println("Ошибка.Произошел переход в другой раздел!");
        }else {
            System.out.println("Пользователь остается в том же разделе!");
        }

        WebElement shopParameters = driver.findElement(By.cssSelector("#subtab-ShopParameters span"));
        shopParameters.click();
        Thread.sleep(2000);
        razdel = driver.findElement(By.className("page-title")).getText();
        System.out.println(razdel);
        driver.navigate().refresh();

        if (driver.findElement(By.className("page-title")).getText().equals(razdel)==false){
            System.out.println("Ошибка.Произошел переход в другой раздел!");
        }else {
            System.out.println("Пользователь остается в том же разделе!");
        }

        WebElement advancedParameters = driver.findElement(By.cssSelector("#subtab-AdminAdvancedParameters span"));
        advancedParameters.click();
        Thread.sleep(2000);
        razdel = driver.findElement(By.className("page-title")).getText();
        System.out.println(razdel);
        driver.navigate().refresh();

        if (driver.findElement(By.className("page-title")).getText().equals(razdel)==false){
            System.out.println("Ошибка.Произошел переход в другой раздел!");
        }else {
            System.out.println("Пользователь остается в том же разделе!");
        }
    }
    public static WebDriver getInitFirefoxDriver(){
        System.setProperty("webdriver.gecko.driver",Test.class.getResource ("geckodriver.exe").getPath());
        return new FirefoxDriver();
    }
}
