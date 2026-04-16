package Students;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Yogi {
	
	@Test
	public void amazon() throws InterruptedException {
		
		System.out.println("Amazon");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.amazon.com/");
		
		Thread.sleep(3000);
		driver.quit();
	}

}
