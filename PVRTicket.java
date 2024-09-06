package Marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PVRTicket {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.className("cinemas-inactive")).click();
		driver.findElement(By.xpath("(//span[@class='p-dropdown-label p-inputtext p-placeholder'])[2]")).click();
		driver.findElement(By.xpath("(//li[@class='p-dropdown-item'])[1]")).click();
		driver.findElement(By.xpath("(//span[text()='31 Aug'])")).click();
		driver.findElement(By.xpath("(//span[text()='VAAZHAI'])[2]")).click();
		driver.findElement(By.xpath("//span[text()='06:40 PM']")).click();
		driver.findElement(By.xpath("//span[text()='Book']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
		driver.findElement(By.xpath("(//span[@class='seat-current-pvr'])[4]")).click();
		driver.findElement(By.xpath("//button[@class='sc-gutikT eAFFWk btn-proceeded']")).click();
		WebElement seatNo = driver.findElement(By.xpath("//div[@class='seat-number']"));
	    String text = seatNo.getText();
	    System.out.println("Selected Seat No:" + " " + text );
	    WebElement grandTotal = driver.findElement(By.xpath("(//span[text()='221.46'])[2]"));
	    String total = grandTotal.getText();
	    System.out.println("Grand Total:" + " " + total);
	    driver.findElement(By.xpath("//button[text()='Proceed']")).click();
	    driver.findElement(By.xpath("(//i[@class='pi pi-times'])[2]")).click();
	    
	    String title = driver.getTitle(); 
		 
	    System.out.println(title);
		 //driver.close();
	
	
	
	
	}

}
