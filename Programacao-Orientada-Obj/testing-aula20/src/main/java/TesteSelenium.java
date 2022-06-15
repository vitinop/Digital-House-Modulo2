import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteSelenium {
    public static void main (String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        WebElement campoUser = driver.findElement(By.id("user-name"));
        campoUser.sendKeys("standard_user");

        WebElement campoSenha = driver.findElement(By.id("password"));
        campoSenha.sendKeys("secret_sauce");

        WebElement botaoLogin = driver.findElement(By.id("login-button"));
        botaoLogin.click();
    }
}
