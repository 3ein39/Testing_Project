import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FindElementByID {
    WebDriver driver;
    @BeforeTest
    public void openUrl()
    {
        driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");
    }
    @Test
    public void find_element_by_id()
    {
        WebElement usernameText=driver.findElement(By.id("username"));
        WebElement passwordText=driver.findElement(By.id("password"));
        System.out.println(usernameText.getTagName());
        System.out.println(passwordText.getSize());
    }
    @AfterTest
    public void closeUrl()
    {
        driver.quit();
    }
}