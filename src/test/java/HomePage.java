import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.By.id;

public class HomePage {
    @FindBy(id="login")
     WebElement login;
    WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    By userName= id("userName");
    By password= id("password");
    public void loginBtn(){
        driver.findElement(LoginBtn).click();
    }
    public void setUserName(String name){
        driver.findElement(userName).sendKeys(name);
    }
    public void setPassword(String pass){
        driver.findElement(password).sendKeys(pass);
    }
    public void login(String name,String pass){
        setUserName(name);
        setPassword(pass);
        loginBtn();
    }

}
