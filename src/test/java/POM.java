import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POM {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/login");
        HomePage homePage=new HomePage(driver);
        homePage.login("Rohit_09","abc@123");

    }
}
