package Marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://amazon.in");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input[@class=\"nav-input nav-progressive-attribute\"])[1]")).sendKeys("bags for boys");
		driver.findElement(By.xpath("(//input[@class=\"nav-input nav-progressive-attribute\"])[2]")).click();
		WebElement result = driver.findElement(By.xpath("//div[@class=\"a-section a-spacing-small a-spacing-top-small\"]"));
		String printResult= result.getText();
		System.out.println(printResult);
		driver.findElement(By.xpath("(//i[@class=\"a-icon a-icon-checkbox\"])[3]")).click();
		driver.findElement(By.xpath("(//i[@class=\"a-icon a-icon-checkbox\"])[4]")).click();
		driver.findElement(By.xpath("//span[@class=\"a-button-text a-declarative\"]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("(//a[@class=\"a-dropdown-link\"])[4]")).click();
		WebElement skuID = driver.findElement(By.xpath("//span[text()=\"String 15L Casual Daypack Backpack with Drawstring Compartment - Teal\"]"));
		String skuName = skuID.getText();
		System.out.println(skuName);
		WebElement price = driver.findElement(By.xpath("(//span[text()=\"329\"])[1];"));
		String disPrice = price.getText();
		System.out.println(disPrice);
	
	
	}

}

