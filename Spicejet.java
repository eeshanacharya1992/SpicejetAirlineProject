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
	driver.findElement(By.xpath("(//input[@autocapitalize='sentences'])[3]")).sendKeys("9861073595");
	driver.findElement(By.xpath("(//input[@autocapitalize='sentences'])[4]")).sendKeys("Eeshan@1992");
	driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-184aecr r-z2wwpe r-1loqt21 r-18u37iz r-tmtnm0 r-1777fci r-1x0uki6 r-1w50u8q r-ah5dr5 r-1otgn73']")).click();
    
	
	}

}
