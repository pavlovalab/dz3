import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;


public class MyLogger implements WebDriverEventListener {

    public void debug(String str) {
        System.out.println(str);
    }

    public void afterAlertAccept(WebDriver var1) {

    }

    public void beforeAlertAccept(WebDriver var1) {

    }

    public void afterAlertDismiss(WebDriver var1) {

    }

    public void beforeAlertDismiss(WebDriver var1) {

    }

    public void afterNavigateRefresh(WebDriver var1) {

    }

    public void beforeNavigateTo(String url, WebDriver driver) {
        System.out.print("Переход на страницу " + url);
    }

    public void afterNavigateTo(String url, WebDriver driver) {
        System.out.println(" - выполнен");
    }

    public void beforeNavigateBack(WebDriver driver) {

    }

    public void afterNavigateBack(WebDriver driver) {

    }

    public void beforeNavigateForward(WebDriver driver) {

    }

    public void afterNavigateForward(WebDriver driver) {

    }

    public void beforeNavigateRefresh(WebDriver var1) {

    }

    public void beforeFindBy(By by, WebElement element, WebDriver driver) {
        System.out.println("Поиск элемента по " + by);
    }

    public void afterFindBy(By by, WebElement element, WebDriver driver) {
        
    }

    public void beforeClickOn(WebElement element, WebDriver driver) {
        System.out.print("Click по " + element.getTagName());
    }

    public void afterClickOn(WebElement element, WebDriver driver) {
        System.out.println(" - Click выполнен");
    }

    public void afterChangeValueOf(WebElement var1, WebDriver var2, CharSequence[] var3) {

    }

    public void beforeChangeValueOf(WebElement var1, WebDriver var2, CharSequence[] var3) {

    }

    public void beforeScript(String script, WebDriver driver) {

    }

    public void afterScript(String script, WebDriver driver) {

    }

    public void onException(Throwable throwable, WebDriver driver) {

    }
}
