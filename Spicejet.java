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
	driver.findElement(By.xpath("(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[1]")).sendKeys("Delhi");
	driver.findElement(By.xpath("(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[2]")).sendKeys(Keys.BACK_SPACE);
	driver.findElement(By.xpath("(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[2]")).sendKeys(Keys.BACK_SPACE);
	driver.findElement(By.xpath("(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[2]")).sendKeys("Mumbai");
	driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[3]"));
	driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-6koalj r-18u37iz r-d0pm55'])[4]/div[5]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[4]/div[1]")).click();
	driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-6koalj r-18u37iz r-d0pm55'])[6]/div[6]")).click();
        driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-1g94qm0 r-1w50u8q r-ah5dr5 r-1otgn73']")).click();
	
	}

}
