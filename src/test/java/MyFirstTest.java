/* непонятно, что значит
Error:(1, 1) java: class, interface, or enum expected */

from selenium import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

public class MyFirstTest {

    private WebDriver driver;
    private WebDriver wait;

    @Before
    public void start() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
    }

    @Test
    public void MyFirstTest() {
        driver.get("http://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("webdriver");
        driver.findElement(By.name("btnG")).click();
        wait.until(titleIs("webriver - поиск в Google"));
    }

    @After
    public void stop () {
        driver.quit();
        driver=null;
    }
}
