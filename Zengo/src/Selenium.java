import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
	WebDriver driver;
	
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "/Users/Ido Finzy/Downloads/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://zengo.com/");
		//driver.get("https://zengo.com/free-bitcoin/");
		driver.manage().window().maximize();
	}
	
	public void pressFreeBitcoin() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("a[href='https://zengo.com/free-bitcoin/']")).click();
	}
	
	public void pressDownloadZenGo() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("a[data-lity]")).click();
	}
	
	public void navigate() throws InterruptedException {
		Thread.sleep(2000);
		driver.navigate().back();
	}
	
	public void closeBrowser() {
		driver.quit();
	}
	
	public static void main(String[] args) throws InterruptedException {
		Selenium sel = new Selenium();
		sel.launchBrowser();
		sel.pressFreeBitcoin();
		sel.pressDownloadZenGo();
		sel.navigate();
		sel.closeBrowser();
	}

}
