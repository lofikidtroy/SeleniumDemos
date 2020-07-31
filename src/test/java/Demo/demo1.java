package Demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import java.util.concurrent.TimeUnit;
public class demo1 {
    public static void main(String[] args)throws InterruptedException{
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\lofik\\IdeaProjects\\SeleniumDemos\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("http://thedemosite.co.uk/index.php");
    driver.manage().window().maximize();
    driver.findElement(By.linkText("3. Add a User")).click();
    driver.findElement(By.name("username")).sendKeys("TMobile");
    driver.findElement(By.name("password")).sendKeys("Admin");
    driver.findElement(By.name("FormsButton2")).click();
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    driver.findElement(By.linkText("4. Login")).click();
    driver.findElement(By.name("username")).sendKeys("TMobile");
    driver.findElement(By.name("password")).sendKeys("Admin");
    driver.findElement(By.name("FormsButton2")).click();
    Thread.sleep(5000);
    driver.quit();


    }





}
