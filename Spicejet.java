package automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Spicejet {

	public static void main(String[] args) {
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://www.spicejet.com/");
	//driver.navigate().refresh();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement login=driver.findElement(By.xpath("(//div[.='Login'])[1]"));
	login.click();
	click();
    
	
	}

}
