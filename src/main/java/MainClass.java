import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainClass {
    public static void main(String[] args) throws InterruptedException {
        WebDriver fdriver = getInitFirefoxDriver();
        fdriver.manage().window().maximize();

        EventFiringWebDriver driver = new EventFiringWebDriver(fdriver);
        MyLogger eventListener = new MyLogger();
        driver.register(eventListener);

        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");

        eventListener.debug("Войти в Админ Панель:");
        driver.findElement(By.id("email")).sendKeys("webinar.test@gmail.com");

        Thread.sleep(1000);

        driver.findElement(By.id("passwd")).sendKeys("Xcg7299bnSmMuRLp9ITw");

        Thread.sleep(1000);

        driver.findElement(By.name("submitLogin")).click();

        eventListener.debug("Выбрать пункт меню Каталог -> категории:");
        //Ожидание появления меню
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#subtab-AdminCatalog[data-submenu='9']")));

        WebElement catalog = driver.findElement(By.cssSelector("#subtab-AdminCatalog[data-submenu='9']"));
        WebElement orders = driver.findElement(By.cssSelector("#subtab-AdminParentOrders[data-submenu='3']"));

        Actions builder = new Actions(driver);
        do {
            builder.moveToElement(catalog).perform();
            try {
                // Ожидание появление подменю
                new WebDriverWait(driver, 1).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#subtab-AdminCategories[data-submenu='11']")));
                break;
            } catch (Exception e) {
                eventListener.debug("Ожидание появление подменю!");
            }
            builder.moveToElement(orders).perform();
        } while (1 == 1);

        WebElement category = driver.findElement(By.cssSelector("#subtab-AdminCategories[data-submenu='11']"));
        builder.moveToElement(category).click().perform();

        eventListener.debug("Нажать «Добавить категорию»:");
        //Ожидание страницы управления категориями
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#page-header-desc-category-new_category[title='Добавить категорию']")));
        driver.findElement(By.cssSelector("#page-header-desc-category-new_category[title='Добавить категорию']")).click();

        eventListener.debug("Ввести название новой категории и сохранить изменения:");
        //заполнение имя новой категории
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.id("link_rewrite_1")));
        driver.findElement(By.id("name_1")).sendKeys("Fruits");

        Thread.sleep(1000);

        //нажимаем на кнопку сохранить
        driver.findElement(By.id("category_form_submit_btn")).click();

        //ожидание появления сообщения
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#content>.bootstrap>.alert")));
        String alert = driver.findElement(By.cssSelector("#content>.bootstrap>.alert")).getAttribute("class");
        if (alert.equals("alert alert-success")) {
            eventListener.debug("Категория успешно создана!");

            eventListener.debug("Отфильтровать таблицу категорий по имени:");
            //поиск по имени в фильтре
            driver.findElement(By.name("categoryFilter_name")).sendKeys("Fruits");

            //поиск и нажатие на кнопку "Поиск"
            driver.findElement(By.id("submitFilterButtoncategory")).click();

            //ожидание появления таблицы категорий
            new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#table-category")));

            //поиск созданной категории в таблице
            if (!driver.findElements(By.xpath("//td[preceding-sibling::td[contains(.,'Fruits')]]")).isEmpty()) {
                eventListener.debug("Запись созданной категории присутствует!");
            } else {
                eventListener.debug("Запись созданной категории отсутствует!");
            }
        } else {
            eventListener.debug("Ошибка создания категории!");
        }

        Thread.sleep(5000);
        driver.quit();
        driver.unregister(eventListener);
    }

    public static WebDriver getInitFirefoxDriver() {
        System.setProperty("webdriver.gecko.driver", MainClass.class.getResource("geckodriver.exe").getPath());
        return new FirefoxDriver();
    }
}
